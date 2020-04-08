# coviz

A barebones template for visualising COVID-19 data with Oz/Vega-lite and PostgreSQL

## Database setup

First, download the Postgres docker image and get it running:

```
docker-compose up
```

Once this is going, run the data import script:

```
docker exec -it coviz_db_1 psql -U postgres -f data/create-db.sql
```

You should see this output:

```
CREATE DATABASE
You are now connected to database "coviz" as user "postgres".
CREATE TABLE
COPY 14168
```

## Open a REPL and visualise the data

Now we're ready to roll! No need to run a server, we're just going to use the REPL. Start your favourite one now.

In the case of emacs, open up `src/coviz/app.clj` and run `M-x cider-jack-in` to start a REPL.

Uncomment and evaluate the forms one by one. Edit the DB query and see how the visualisation updates.

The visualisation is created using [Oz](https://github.com/metasoarous/oz), which is a Clojure wrapper around the fantastic [Vega-Lite](https://vega.github.io/vega-lite/). The best way to understand it is to read through the [docs](https://vega.github.io/vega-lite/docs/) and [examples](https://vega.github.io/vega-lite/examples/) for Vega-Lite, and translate them into Clojure maps.

Happy Hacking!
