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
 * Manage and invoke AWS Lambda functions using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Lambda2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS 2 Lambda component.
     */
    public interface Lambda2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLambda2EndpointBuilder advanced() {
            return (AdvancedLambda2EndpointBuilder) this;
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
        default Lambda2EndpointBuilder lazyStartProducer(
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
        default Lambda2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.lambda.Lambda2Operations</code>
         * type.
         * 
         * Default: invokeFunction
         * Group: producer
         */
        default Lambda2EndpointBuilder operation(Lambda2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws2.lambda.Lambda2Operations</code>
         * type.
         * 
         * Default: invokeFunction
         * Group: producer
         */
        default Lambda2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Lambda2EndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Lambda2EndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * The region in which ECS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Lambda2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Lambda2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Lambda2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default Lambda2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default Lambda2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Lambda client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: proxy
         */
        default Lambda2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Lambda client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: proxy
         */
        default Lambda2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Lambda client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.core.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: proxy
         */
        default Lambda2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Lambda2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Lambda2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS 2 Lambda component.
     */
    public interface AdvancedLambda2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Lambda2EndpointBuilder basic() {
            return (Lambda2EndpointBuilder) this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.lambda.LambdaClient</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedLambda2EndpointBuilder awsLambdaClient(
                Object awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
            return this;
        }
        /**
         * To use a existing configured AwsLambdaClient as client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.lambda.LambdaClient</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedLambda2EndpointBuilder awsLambdaClient(
                String awsLambdaClient) {
            doSetProperty("awsLambdaClient", awsLambdaClient);
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
        default AdvancedLambda2EndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedLambda2EndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws2.lambda.Lambda2Operations</code>
     * enum.
     */
    enum Lambda2Operations {
        listFunctions,
        getFunction,
        createAlias,
        deleteAlias,
        getAlias,
        listAliases,
        createFunction,
        deleteFunction,
        invokeFunction,
        updateFunction,
        createEventSourceMapping,
        deleteEventSourceMapping,
        listEventSourceMapping,
        listTags,
        tagResource,
        untagResource,
        publishVersion,
        listVersions;
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface Lambda2Builders {
        /**
         * AWS 2 Lambda (camel-aws2-lambda)
         * Manage and invoke AWS Lambda functions using AWS SDK version 2.x.
         * 
         * Category: cloud,computing,serverless
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-lambda
         * 
         * Syntax: <code>aws2-lambda:function</code>
         * 
         * Path parameter: function (required)
         * Name of the Lambda function.
         * 
         * @param path function
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder aws2Lambda(String path) {
            return Lambda2EndpointBuilderFactory.endpointBuilder("aws2-lambda", path);
        }
        /**
         * AWS 2 Lambda (camel-aws2-lambda)
         * Manage and invoke AWS Lambda functions using AWS SDK version 2.x.
         * 
         * Category: cloud,computing,serverless
         * Since: 3.2
         * Maven coordinates: org.apache.camel:camel-aws2-lambda
         * 
         * Syntax: <code>aws2-lambda:function</code>
         * 
         * Path parameter: function (required)
         * Name of the Lambda function.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path function
         * @return the dsl builder
         */
        default Lambda2EndpointBuilder aws2Lambda(
                String componentName,
                String path) {
            return Lambda2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static Lambda2EndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class Lambda2EndpointBuilderImpl extends AbstractEndpointBuilder implements Lambda2EndpointBuilder, AdvancedLambda2EndpointBuilder {
            public Lambda2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Lambda2EndpointBuilderImpl(path);
    }
}