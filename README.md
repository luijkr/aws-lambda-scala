# aws-lambda-hello-scala

A simple project to demonstrate how to _locally_ develop AWS Lambda functions using Scala. This is further detailed on [my blog](https://reneluijk.netlify.com/blog/).

## First things first

Requirements of this project:
- [SBT](https://www.scala-sbt.org/)
- [Docker](https://www.docker.com/)
- [SAM](https://aws.amazon.com/serverless/sam/)

## Running the function locally

Compile the package and start up the API

```
sbt assembly
sam local start-api
```

Alternatively, use
 
```sbt assembly && sam local start-api```


Check out the function by calling the following, e.g. using `curl`:

```
curl -X POST localhost:3000 \
    --header 'Content-Type: application/json' \
    --data '{"example-field": "example-value"}'
```

