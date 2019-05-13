# Concourse Learning
## overview
A Concourse installation is composed of a web node, a worker node, and a PostgreSQL node.
## Quick Start
**Docker**

$ wget https://concourse-ci.org/docker-compose.yml

$ docker-compose up -d

**Installation**

[how to install on ubuntu](https://www.digitalocean.com/community/tutorials/how-to-install-concourse-ci-on-ubuntu-16-04)

Install fly

**fly**


| ./fly       | -target   | example  | login | --team-name | my-team| --concourse-url | https://ci.example.com |
| ---------- |:---------:|----------:|-------:|------:|------:|---------:| -----:|
| fly cli     | authenticate with new target| name of new target | login command | team-name parameter , if not set default to main | new team name | url parameters | url value | 



| ./fly       | -t   | example  | set-pipeline | -p | my-pipe| --config | pipeline.yml |
| ---------- |:---------:|----------:|-------:|------:|------:|---------:| -----:|
| fly cli     | target in short| target name | | pipeline in short | new pipeline name | in short is -c | config file | 
