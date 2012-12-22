# cljs-kickoff

A Leiningen template for minimal ClojureScript project with lein-cljsbuild.

It's intended to be as small as possible - only use Ring, ClojureScript and 
lein-cljsbuild. Users are free to add any other libraries as they like.

It has complete configuration for lein-cljsbuild. The plugin compiles .cljs
files so that Ring can immediately serve them, it also is configured to
compile and include them in build.

## Usage

Create project:

```bash
lein new cljs-kickoff my-project
```

Up and running (with CLJS compilation):
```bash
cd my-project
lein run
```

Interactive developmnt:
```bash
# Shell 1 - start server:
cd my-project
lein run

# Shell 2 - cljsbuild will recompile cljs whenever the files change:
cd my-project
lein cljsbuild auto
```

Package and run from jar:
```bash
cd my-project
lein uberjar
java -jar target/my-project-0.1.0-SNAPSHOT-standalone.jar
```

## More resources

This project is intentionally minimal. There's plenty resources on ClojureScript
on the web. Feel free to take a look at the posts on my blog at
http://squirrel.pl/blog/tag/clojurescript/

## License

Copyright © 2012 Konrad Garus

Distributed under the Eclipse Public License, the same as Clojure.
