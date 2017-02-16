# Scala Codegen
This is a boilerplate project demonstrating use of sbt-datatype for generating scala classes

## Usage
+ Define [avro](http://avro.apache.org/) schemas for the models you wish to create. [Further details](http://www.scala-sbt.org/0.13/docs/Datatype.html)
+ compile the project

## References
>>> The blog that inspired this project - [3 approaches to Scala code generation](http://yefremov.net/blog/scala-code-generation/), [source code](https://github.com/dmitriy-yefremov/scala-code-gen)
>>> Development sbt-datatype has stopped and moved to [contraband](https://github.com/sbt/contraband)
>>> For experimental explorations in metaprogramming, I'd recommend [treehugger](http://eed3si9n.com/treehugger/)
>>> Heavily referred to [gigahorse](https://github.com/eed3si9n/gigahorse) for figuring out sbt-datatype usage and sbt options
>>> For further reading on mocking in Scala, [scalamock](http://scalamock.org/)
>>> And always to revise testing paradigms in Scala, [scalatest](http://www.scalatest.org/)
>>> Did not have enough time to evaluate these, but looked interesting nonetheless
+ [scraml](http://scraml.io/)
+ [salat](https://github.com/salat/salat)
+ [autoschema](https://github.com/coursera/autoschema)
>>> There are a few JSON to AVRO converters available, I've listed the notable ones
+ [json2avro](https://github.com/grisha/json2avro)
>>> This is an interesting project with goals similar to this project - [json-schema-codegen](https://github.com/VoxSupplyChain/json-schema-codegen)
>>> This is a multi-project build. You can read more about it [here](http://www.scala-sbt.org/0.13/docs/Multi-Project.html)