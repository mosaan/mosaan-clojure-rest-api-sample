# mosaan-clojure-rest-api

Sample REST API server based on Clojure.
This project's content based on [@lagenorhynque article on Qiita](https://qiita.com/lagenorhynque/items/b15689e5432e0170b172).

## Usage (in development, w/ VSCode & Remote-Containers extention.)

Thanks to VSCode `Remote-Containers` extention, you can just run `Remote-Containers: Reopen in Container` command.
Open command pallet in VSCode with `Ctrl + Shift + P`, then search and execute the command.
Now you can access the container in a VSCode terminal(`Ctrl + Shift + @`).
After opening the terminal, you can run `lein` commands like those:

```sh
lein run # run application
```

```sh
lein repl
# ... run repl ...
mosaan-clojure-rest-api.core=> (def system (ig/init config))
```

then you get a VSCode notification like this: 

> Your service running on port 3000 is available. See all forwarded ports

Let's try to access `http://localhost:3000` in a browser.
Now you will get `Hello, World!` message in the browser.

### Package into `Uberjar`

Just run the following command in the (Remote-Container's) terminal.

```sh
lein uberjar
```

Now you will get `mosaan-clojure-rest-api-${version}-SNAPSHOT-standalone.jar` in `target/uberjar` directory.
You can start the server in any Java environments with:

```sh
java -jar mosaan-clojure-rest-api-${version}-SNAPSHOT-standalone.jar
```
