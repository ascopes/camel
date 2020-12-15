/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Send RDD or DataFrame jobs to Apache Spark clusters.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SparkEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spark component.
     */
    public interface SparkEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSparkEndpointBuilder advanced() {
            return (AdvancedSparkEndpointBuilder) this;
        }
        /**
         * Indicates if results should be collected or counted.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default SparkEndpointBuilder collect(boolean collect) {
            doSetProperty("collect", collect);
            return this;
        }
        /**
         * Indicates if results should be collected or counted.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default SparkEndpointBuilder collect(String collect) {
            doSetProperty("collect", collect);
            return this;
        }
        /**
         * DataFrame to compute against.
         * 
         * The option is a:
         * <code>org.apache.spark.sql.Dataset&lt;org.apache.spark.sql.Row&gt;</code> type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder dataFrame(Object dataFrame) {
            doSetProperty("dataFrame", dataFrame);
            return this;
        }
        /**
         * DataFrame to compute against.
         * 
         * The option will be converted to a
         * <code>org.apache.spark.sql.Dataset&lt;org.apache.spark.sql.Row&gt;</code> type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder dataFrame(String dataFrame) {
            doSetProperty("dataFrame", dataFrame);
            return this;
        }
        /**
         * Function performing action against an DataFrame.
         * 
         * The option is a:
         * <code>org.apache.camel.component.spark.DataFrameCallback</code> type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder dataFrameCallback(Object dataFrameCallback) {
            doSetProperty("dataFrameCallback", dataFrameCallback);
            return this;
        }
        /**
         * Function performing action against an DataFrame.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.spark.DataFrameCallback</code> type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder dataFrameCallback(String dataFrameCallback) {
            doSetProperty("dataFrameCallback", dataFrameCallback);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SparkEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SparkEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * RDD to compute against.
         * 
         * The option is a: <code>org.apache.spark.api.java.JavaRDDLike</code>
         * type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder rdd(Object rdd) {
            doSetProperty("rdd", rdd);
            return this;
        }
        /**
         * RDD to compute against.
         * 
         * The option will be converted to a
         * <code>org.apache.spark.api.java.JavaRDDLike</code> type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder rdd(String rdd) {
            doSetProperty("rdd", rdd);
            return this;
        }
        /**
         * Function performing action against an RDD.
         * 
         * The option is a:
         * <code>org.apache.camel.component.spark.RddCallback</code> type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder rddCallback(Object rddCallback) {
            doSetProperty("rddCallback", rddCallback);
            return this;
        }
        /**
         * Function performing action against an RDD.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.spark.RddCallback</code> type.
         * 
         * Group: producer
         */
        default SparkEndpointBuilder rddCallback(String rddCallback) {
            doSetProperty("rddCallback", rddCallback);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spark component.
     */
    public interface AdvancedSparkEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SparkEndpointBuilder basic() {
            return (SparkEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSparkEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSparkEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface SparkBuilders {
        /**
         * Spark (camel-spark)
         * Send RDD or DataFrame jobs to Apache Spark clusters.
         * 
         * Category: bigdata,iot
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-spark
         * 
         * Syntax: <code>spark:endpointType</code>
         * 
         * Path parameter: endpointType (required)
         * Type of the endpoint (rdd, dataframe, hive).
         * There are 3 enums and the value can be one of: rdd, dataframe, hive
         * 
         * @param path endpointType
         * @return the dsl builder
         */
        default SparkEndpointBuilder spark(String path) {
            return SparkEndpointBuilderFactory.endpointBuilder("spark", path);
        }
        /**
         * Spark (camel-spark)
         * Send RDD or DataFrame jobs to Apache Spark clusters.
         * 
         * Category: bigdata,iot
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-spark
         * 
         * Syntax: <code>spark:endpointType</code>
         * 
         * Path parameter: endpointType (required)
         * Type of the endpoint (rdd, dataframe, hive).
         * There are 3 enums and the value can be one of: rdd, dataframe, hive
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path endpointType
         * @return the dsl builder
         */
        default SparkEndpointBuilder spark(String componentName, String path) {
            return SparkEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static SparkEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SparkEndpointBuilderImpl extends AbstractEndpointBuilder implements SparkEndpointBuilder, AdvancedSparkEndpointBuilder {
            public SparkEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SparkEndpointBuilderImpl(path);
    }
}