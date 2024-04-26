# Apache Kafka
Apache Kafka is a distributed event streaming platform. It can handle large volumes of data, is highly scalable, and provides low latency and fault tolerance.

Kafka provides a powerful yet simple Producer and Consumer APIs and it's useful for publishing and subscribing to events.Kafka streams API and ksqlDB can be used to implement data streaming pipelines using a programming language and SQL respectively

Kafka Connect is another powerful extension to implement data integration use cases by moving data between data between different relational/NoSQL databases, Data Lakes etc.

Some of the disadvantages are
- Complex infrastructure to self manage
- Huge set of configuration parameters
- Not the best for large scale stateful processing


# Apache Flink
Apache Flink is a popular open source distributed stream processing framework which provides low latency, high throughout, fault tolerance with exactly once support.

The USP about Flink is its support for unified batch and stream processing where any input source is treated as either a bounded or unbounded stream. It also supports event time processing. Stream processing pipelines can be written in Java, Scala, Python or even SQL.

It's a perfect choice for large-scale stateful stream processing with low latency and high throughout requirements. Flink SQL provides a SQL friendly way to define stream processing pipelines.

Flink has a relatively steep learning curve especially around the event time and state management semantics.


# Apache Spark

Apache Spark is a distributed batch processing framework which can process huge volumes of batch data with high throughout. It also supports stream processing using a micro batch approach. Spark is an ideal choice for high volume batch processing use cases.

Spark jobs can be written in Java, Scala, Python and SQL. It may not be the ideal choice for low latency realtime stream processing use cases compared to Kafka Streams and Flink 