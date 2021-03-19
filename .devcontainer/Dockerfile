FROM clojure:openjdk-11-lein

# setup environment variables
ENV LANG C.UTF-8
ENV DEBIAN_FRONTEND noninteractive
ENV JOKER_VERSION 0.12.5
ENV SHELL /bin/bash

RUN apt-get update \
    && apt-get -y install --no-install-recommends apt-utils 2>&1 \
    #
    # Verify git, process tools, lsb-release (common in install instructions for CLIs) installed
    && apt-get -y install git procps lsb-release \
    #
    # Clean up
    && apt-get autoremove -y \
    && apt-get clean -y \
    && rm -rf /var/lib/apt/lists/* \
    #
    # install joker
    && wget https://github.com/candid82/joker/releases/download/v${JOKER_VERSION}/joker-${JOKER_VERSION}-linux-amd64.zip \
    && unzip joker-${JOKER_VERSION}-linux-amd64.zip \
    && rm joker-${JOKER_VERSION}-linux-amd64.zip \
    && chmod a+x joker && mv joker /usr/bin

# Switch back to dialog for any ad-hoc use of apt-get
ENV DEBIAN_FRONTEND=dialog

COPY . /usr/src/app
WORKDIR /usr/src/app
CMD ["lein", "run"]