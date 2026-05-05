# Intuition

A markdown editor with some nice features

## Stack

- back-end: Spring Boot (Java)
- Front-end: React + vite (Node.js)
- Database: In memory (Hashmap on backend)

# Running

## Prerequisites

Make sure you have a JVM and Node.js installed on your computer

Firstly clone the repository, thats already half the job done. After that enter the ```my-notes-app``` folder, then run ```npm install```

## Running both back and front end

To start the backend run the follow command while on the general project folder

```
./gradlew bootRun
```

On another terminal window or tab run the following command to start the frontend

```
npm run dev
```

OBS: This frontend command is ideal for development environments, on deploy another command must be used

# Features

## Complete features
- Login/Register
- Markdown file editor
- External image insertion
- Math katex notation
- Share copy with another user
- Create folder and subfolders

## Incomplete features
- Manual graph creation (backend only)
- Auto graph creation (not complete on backend)

# Project structure
- ```entities``` - the fundamental entities of the application
  -   User
  -   File (Abstract)
  -   Folder
  -    Document
  -   Edge
  -   Vertex
- ```repositories``` - classes that are responsible for manage collections of entities (is what would connect to the database, if there was any)
- ```controllers``` - manage HTTP requests and call the repository to return the requested information or create object informed on the request body
