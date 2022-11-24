# Greetings Service

## Local Development

* Use profile `local-springboot`

## Database

### Install

* Follow instructions specific to the platform
* See https://github.com/shaunthomas999/dev-notes

### Setup

* Execute the following commands in PSQL CLI
  * `psql -U postgres`
  * `CREATE ROLE "postgresql_admin" WITH LOGIN PASSWORD 'admin' SUPERUSER CREATEDB CREATEROLE;`
  * `CREATE ROLE "greetings-db-user" WITH LOGIN PASSWORD 'greetings-pw' SUPERUSER CREATEDB CREATEROLE;`
  * `CREATE DATABASE "greetings-db" OWNER "greetings-db-user";`
  * `\c "greetings-db"`
  * `CREATE SCHEMA greetings AUTHORIZATION "greetings-db-user";`
