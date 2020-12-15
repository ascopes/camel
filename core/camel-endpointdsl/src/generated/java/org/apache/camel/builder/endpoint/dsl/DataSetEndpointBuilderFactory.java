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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Provide data for load and soak testing of your Camel application.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DataSetEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Dataset component.
     */
    public interface DataSetEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedDataSetEndpointConsumerBuilder advanced() {
            return (AdvancedDataSetEndpointConsumerBuilder) this;
        }
        /**
         * Controls the behaviour of the CamelDataSetIndex header. For
         * Consumers: - off = the header will not be set - strict/lenient = the
         * header will be set For Producers: - off = the header value will not
         * be verified, and will not be set if it is not present = strict = the
         * header value must be present and will be verified = lenient = the
         * header value will be verified if it is present, and will be set if it
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: lenient
         * Group: common
         */
        default DataSetEndpointConsumerBuilder dataSetIndex(String dataSetIndex) {
            doSetProperty("dataSetIndex", dataSetIndex);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Time period in millis to wait before starting sending messages.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 1000
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Time period in millis to wait before starting sending messages.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 1000
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Wait until the DataSet contains at least this number of messages.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 0
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder minRate(int minRate) {
            doSetProperty("minRate", minRate);
            return this;
        }
        /**
         * Wait until the DataSet contains at least this number of messages.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 0
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder minRate(String minRate) {
            doSetProperty("minRate", minRate);
            return this;
        }
        /**
         * Sets how many messages should be preloaded (sent) before the route
         * completes its initialization.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder preloadSize(long preloadSize) {
            doSetProperty("preloadSize", preloadSize);
            return this;
        }
        /**
         * Sets how many messages should be preloaded (sent) before the route
         * completes its initialization.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder preloadSize(String preloadSize) {
            doSetProperty("preloadSize", preloadSize);
            return this;
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * sent by the consumer (to simulate slow processing).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 3
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder produceDelay(long produceDelay) {
            doSetProperty("produceDelay", produceDelay);
            return this;
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * sent by the consumer (to simulate slow processing).
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 3
         * Group: consumer
         */
        default DataSetEndpointConsumerBuilder produceDelay(String produceDelay) {
            doSetProperty("produceDelay", produceDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Dataset component.
     */
    public interface AdvancedDataSetEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default DataSetEndpointConsumerBuilder basic() {
            return (DataSetEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDataSetEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDataSetEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDataSetEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDataSetEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
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
        default AdvancedDataSetEndpointConsumerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedDataSetEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Dataset component.
     */
    public interface DataSetEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDataSetEndpointProducerBuilder advanced() {
            return (AdvancedDataSetEndpointProducerBuilder) this;
        }
        /**
         * Controls the behaviour of the CamelDataSetIndex header. For
         * Consumers: - off = the header will not be set - strict/lenient = the
         * header will be set For Producers: - off = the header value will not
         * be verified, and will not be set if it is not present = strict = the
         * header value must be present and will be verified = lenient = the
         * header value will be verified if it is present, and will be set if it
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: lenient
         * Group: common
         */
        default DataSetEndpointProducerBuilder dataSetIndex(String dataSetIndex) {
            doSetProperty("dataSetIndex", dataSetIndex);
            return this;
        }
        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder assertPeriod(long assertPeriod) {
            doSetProperty("assertPeriod", assertPeriod);
            return this;
        }
        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder assertPeriod(String assertPeriod) {
            doSetProperty("assertPeriod", assertPeriod);
            return this;
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * consumed by the producer (to simulate slow processing).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder consumeDelay(long consumeDelay) {
            doSetProperty("consumeDelay", consumeDelay);
            return this;
        }
        /**
         * Allows a delay to be specified which causes a delay when a message is
         * consumed by the producer (to simulate slow processing).
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder consumeDelay(String consumeDelay) {
            doSetProperty("consumeDelay", consumeDelay);
            return this;
        }
        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default DataSetEndpointProducerBuilder expectedCount(int expectedCount) {
            doSetProperty("expectedCount", expectedCount);
            return this;
        }
        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default DataSetEndpointProducerBuilder expectedCount(
                String expectedCount) {
            doSetProperty("expectedCount", expectedCount);
            return this;
        }
        /**
         * Sets whether assertIsSatisfied() should fail fast at the first
         * detected failed expectation while it may otherwise wait for all
         * expected messages to arrive before performing expectations
         * verifications. Is by default true. Set to false to use behavior as in
         * Camel 2.x.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DataSetEndpointProducerBuilder failFast(boolean failFast) {
            doSetProperty("failFast", failFast);
            return this;
        }
        /**
         * Sets whether assertIsSatisfied() should fail fast at the first
         * detected failed expectation while it may otherwise wait for all
         * expected messages to arrive before performing expectations
         * verifications. Is by default true. Set to false to use behavior as in
         * Camel 2.x.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default DataSetEndpointProducerBuilder failFast(String failFast) {
            doSetProperty("failFast", failFast);
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
        default DataSetEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
        default DataSetEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default DataSetEndpointProducerBuilder reportGroup(int reportGroup) {
            doSetProperty("reportGroup", reportGroup);
            return this;
        }
        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default DataSetEndpointProducerBuilder reportGroup(String reportGroup) {
            doSetProperty("reportGroup", reportGroup);
            return this;
        }
        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder resultMinimumWaitTime(
                long resultMinimumWaitTime) {
            doSetProperty("resultMinimumWaitTime", resultMinimumWaitTime);
            return this;
        }
        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder resultMinimumWaitTime(
                String resultMinimumWaitTime) {
            doSetProperty("resultMinimumWaitTime", resultMinimumWaitTime);
            return this;
        }
        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder resultWaitTime(
                long resultWaitTime) {
            doSetProperty("resultWaitTime", resultWaitTime);
            return this;
        }
        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder resultWaitTime(
                String resultWaitTime) {
            doSetProperty("resultWaitTime", resultWaitTime);
            return this;
        }
        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default DataSetEndpointProducerBuilder retainFirst(int retainFirst) {
            doSetProperty("retainFirst", retainFirst);
            return this;
        }
        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default DataSetEndpointProducerBuilder retainFirst(String retainFirst) {
            doSetProperty("retainFirst", retainFirst);
            return this;
        }
        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default DataSetEndpointProducerBuilder retainLast(int retainLast) {
            doSetProperty("retainLast", retainLast);
            return this;
        }
        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default DataSetEndpointProducerBuilder retainLast(String retainLast) {
            doSetProperty("retainLast", retainLast);
            return this;
        }
        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder sleepForEmptyTest(
                long sleepForEmptyTest) {
            doSetProperty("sleepForEmptyTest", sleepForEmptyTest);
            return this;
        }
        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default DataSetEndpointProducerBuilder sleepForEmptyTest(
                String sleepForEmptyTest) {
            doSetProperty("sleepForEmptyTest", sleepForEmptyTest);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Dataset component.
     */
    public interface AdvancedDataSetEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default DataSetEndpointProducerBuilder basic() {
            return (DataSetEndpointProducerBuilder) this;
        }
        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer (advanced)
         */
        default AdvancedDataSetEndpointProducerBuilder copyOnExchange(
                boolean copyOnExchange) {
            doSetProperty("copyOnExchange", copyOnExchange);
            return this;
        }
        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer (advanced)
         */
        default AdvancedDataSetEndpointProducerBuilder copyOnExchange(
                String copyOnExchange) {
            doSetProperty("copyOnExchange", copyOnExchange);
            return this;
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
        default AdvancedDataSetEndpointProducerBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedDataSetEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Dataset component.
     */
    public interface DataSetEndpointBuilder
            extends
                DataSetEndpointConsumerBuilder,
                DataSetEndpointProducerBuilder {
        default AdvancedDataSetEndpointBuilder advanced() {
            return (AdvancedDataSetEndpointBuilder) this;
        }
        /**
         * Controls the behaviour of the CamelDataSetIndex header. For
         * Consumers: - off = the header will not be set - strict/lenient = the
         * header will be set For Producers: - off = the header value will not
         * be verified, and will not be set if it is not present = strict = the
         * header value must be present and will be verified = lenient = the
         * header value will be verified if it is present, and will be set if it
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: lenient
         * Group: common
         */
        default DataSetEndpointBuilder dataSetIndex(String dataSetIndex) {
            doSetProperty("dataSetIndex", dataSetIndex);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Dataset component.
     */
    public interface AdvancedDataSetEndpointBuilder
            extends
                AdvancedDataSetEndpointConsumerBuilder,
                AdvancedDataSetEndpointProducerBuilder {
        default DataSetEndpointBuilder basic() {
            return (DataSetEndpointBuilder) this;
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
        default AdvancedDataSetEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedDataSetEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface DataSetBuilders {
        /**
         * Dataset (camel-dataset)
         * Provide data for load and soak testing of your Camel application.
         * 
         * Category: core,testing
         * Since: 1.3
         * Maven coordinates: org.apache.camel:camel-dataset
         * 
         * Syntax: <code>dataset:name</code>
         * 
         * Path parameter: name (required)
         * Name of DataSet to lookup in the registry
         * 
         * @param path name
         * @return the dsl builder
         */
        default DataSetEndpointBuilder dataset(String path) {
            return DataSetEndpointBuilderFactory.endpointBuilder("dataset", path);
        }
        /**
         * Dataset (camel-dataset)
         * Provide data for load and soak testing of your Camel application.
         * 
         * Category: core,testing
         * Since: 1.3
         * Maven coordinates: org.apache.camel:camel-dataset
         * 
         * Syntax: <code>dataset:name</code>
         * 
         * Path parameter: name (required)
         * Name of DataSet to lookup in the registry
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path name
         * @return the dsl builder
         */
        default DataSetEndpointBuilder dataset(String componentName, String path) {
            return DataSetEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DataSetEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class DataSetEndpointBuilderImpl extends AbstractEndpointBuilder implements DataSetEndpointBuilder, AdvancedDataSetEndpointBuilder {
            public DataSetEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DataSetEndpointBuilderImpl(path);
    }
}