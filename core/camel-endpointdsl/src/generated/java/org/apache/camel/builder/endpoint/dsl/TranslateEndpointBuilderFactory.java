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
 * Translate texts using AWS Translate.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TranslateEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Translate component.
     */
    public interface TranslateEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedTranslateEndpointBuilder advanced() {
            return (AdvancedTranslateEndpointBuilder) this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default TranslateEndpointBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default TranslateEndpointBuilder autoDiscoverClient(
                String autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Being able to autodetect the source language.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default TranslateEndpointBuilder autodetectSourceLanguage(
                boolean autodetectSourceLanguage) {
            doSetProperty("autodetectSourceLanguage", autodetectSourceLanguage);
            return this;
        }
        /**
         * Being able to autodetect the source language.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default TranslateEndpointBuilder autodetectSourceLanguage(
                String autodetectSourceLanguage) {
            doSetProperty("autodetectSourceLanguage", autodetectSourceLanguage);
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
        default TranslateEndpointBuilder lazyStartProducer(
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
        default TranslateEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.translate.TranslateOperations</code> type.
         * 
         * Required: true
         * Default: translateText
         * Group: producer
         */
        default TranslateEndpointBuilder operation(TranslateOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws.translate.TranslateOperations</code> type.
         * 
         * Required: true
         * Default: translateText
         * Group: producer
         */
        default TranslateEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Translate client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Translate client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default TranslateEndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Translate client.
         * 
         * The option will be converted to a <code>com.amazonaws.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default TranslateEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Translate client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Source language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder sourceLanguage(String sourceLanguage) {
            doSetProperty("sourceLanguage", sourceLanguage);
            return this;
        }
        /**
         * Target language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder targetLanguage(String targetLanguage) {
            doSetProperty("targetLanguage", targetLanguage);
            return this;
        }
        /**
         * To use a existing configured AWS Translate as client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.translate.AmazonTranslate</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder translateClient(Object translateClient) {
            doSetProperty("translateClient", translateClient);
            return this;
        }
        /**
         * To use a existing configured AWS Translate as client.
         * 
         * The option will be converted to a
         * <code>com.amazonaws.services.translate.AmazonTranslate</code> type.
         * 
         * Group: producer
         */
        default TranslateEndpointBuilder translateClient(String translateClient) {
            doSetProperty("translateClient", translateClient);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS Translate component.
     */
    public interface AdvancedTranslateEndpointBuilder
            extends
                EndpointProducerBuilder {
        default TranslateEndpointBuilder basic() {
            return (TranslateEndpointBuilder) this;
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
        default AdvancedTranslateEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedTranslateEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.translate.TranslateOperations</code>
     * enum.
     */
    enum TranslateOperations {
        translateText;
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface TranslateBuilders {
        /**
         * AWS Translate (camel-aws-translate)
         * Translate texts using AWS Translate.
         * 
         * Category: cloud,management
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-aws-translate
         * 
         * Syntax: <code>aws-translate:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         * @return the dsl builder
         */
        default TranslateEndpointBuilder awsTranslate(String path) {
            return TranslateEndpointBuilderFactory.endpointBuilder("aws-translate", path);
        }
        /**
         * AWS Translate (camel-aws-translate)
         * Translate texts using AWS Translate.
         * 
         * Category: cloud,management
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-aws-translate
         * 
         * Syntax: <code>aws-translate:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         * @return the dsl builder
         */
        default TranslateEndpointBuilder awsTranslate(
                String componentName,
                String path) {
            return TranslateEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static TranslateEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class TranslateEndpointBuilderImpl extends AbstractEndpointBuilder implements TranslateEndpointBuilder, AdvancedTranslateEndpointBuilder {
            public TranslateEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new TranslateEndpointBuilderImpl(path);
    }
}