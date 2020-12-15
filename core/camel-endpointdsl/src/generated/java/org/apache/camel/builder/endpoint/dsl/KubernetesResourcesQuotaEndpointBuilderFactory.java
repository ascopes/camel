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
 * Perform operations on Kubernetes Resources Quotas.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KubernetesResourcesQuotaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Kubernetes Resources Quota component.
     */
    public interface KubernetesResourcesQuotaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKubernetesResourcesQuotaEndpointBuilder advanced() {
            return (AdvancedKubernetesResourcesQuotaEndpointBuilder) this;
        }
        /**
         * The Kubernetes API Version to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder apiVersion(
                String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The dns domain, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder dnsDomain(
                String dnsDomain) {
            doSetProperty("dnsDomain", dnsDomain);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option is a:
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder kubernetesClient(
                Object kubernetesClient) {
            doSetProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option will be converted to a
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder kubernetesClient(
                String kubernetesClient) {
            doSetProperty("kubernetesClient", kubernetesClient);
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
        default KubernetesResourcesQuotaEndpointBuilder lazyStartProducer(
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
        default KubernetesResourcesQuotaEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Producer operation to do on Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder operation(
                String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The port name, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder portName(String portName) {
            doSetProperty("portName", portName);
            return this;
        }
        /**
         * The port protocol, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: tcp
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder portProtocol(
                String portProtocol) {
            doSetProperty("portProtocol", portProtocol);
            return this;
        }
        /**
         * The CA Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder caCertData(
                String caCertData) {
            doSetProperty("caCertData", caCertData);
            return this;
        }
        /**
         * The CA Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder caCertFile(
                String caCertFile) {
            doSetProperty("caCertFile", caCertFile);
            return this;
        }
        /**
         * The Client Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientCertData(
                String clientCertData) {
            doSetProperty("clientCertData", clientCertData);
            return this;
        }
        /**
         * The Client Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientCertFile(
                String clientCertFile) {
            doSetProperty("clientCertFile", clientCertFile);
            return this;
        }
        /**
         * The Key Algorithm used by the client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyAlgo(
                String clientKeyAlgo) {
            doSetProperty("clientKeyAlgo", clientKeyAlgo);
            return this;
        }
        /**
         * The Client Key data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyData(
                String clientKeyData) {
            doSetProperty("clientKeyData", clientKeyData);
            return this;
        }
        /**
         * The Client Key file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyFile(
                String clientKeyFile) {
            doSetProperty("clientKeyFile", clientKeyFile);
            return this;
        }
        /**
         * The Client Key Passphrase.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyPassphrase(
                String clientKeyPassphrase) {
            doSetProperty("clientKeyPassphrase", clientKeyPassphrase);
            return this;
        }
        /**
         * The Auth Token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder oauthToken(
                String oauthToken) {
            doSetProperty("oauthToken", oauthToken);
            return this;
        }
        /**
         * Password to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder trustCerts(
                Boolean trustCerts) {
            doSetProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder trustCerts(
                String trustCerts) {
            doSetProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Username to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Kubernetes Resources Quota
     * component.
     */
    public interface AdvancedKubernetesResourcesQuotaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KubernetesResourcesQuotaEndpointBuilder basic() {
            return (KubernetesResourcesQuotaEndpointBuilder) this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder connectionTimeout(
                Integer connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder connectionTimeout(
                String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
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
        default AdvancedKubernetesResourcesQuotaEndpointBuilder synchronous(
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
        default AdvancedKubernetesResourcesQuotaEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface KubernetesResourcesQuotaBuilders {
        /**
         * Kubernetes Resources Quota (camel-kubernetes)
         * Perform operations on Kubernetes Resources Quotas.
         * 
         * Category: container,cloud,paas
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * Syntax: <code>kubernetes-resources-quota:masterUrl</code>
         * 
         * Path parameter: masterUrl (required)
         * Kubernetes Master url
         * 
         * @param path masterUrl
         * @return the dsl builder
         */
        default KubernetesResourcesQuotaEndpointBuilder kubernetesResourcesQuota(
                String path) {
            return KubernetesResourcesQuotaEndpointBuilderFactory.endpointBuilder("kubernetes-resources-quota", path);
        }
        /**
         * Kubernetes Resources Quota (camel-kubernetes)
         * Perform operations on Kubernetes Resources Quotas.
         * 
         * Category: container,cloud,paas
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * Syntax: <code>kubernetes-resources-quota:masterUrl</code>
         * 
         * Path parameter: masterUrl (required)
         * Kubernetes Master url
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path masterUrl
         * @return the dsl builder
         */
        default KubernetesResourcesQuotaEndpointBuilder kubernetesResourcesQuota(
                String componentName,
                String path) {
            return KubernetesResourcesQuotaEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static KubernetesResourcesQuotaEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class KubernetesResourcesQuotaEndpointBuilderImpl extends AbstractEndpointBuilder implements KubernetesResourcesQuotaEndpointBuilder, AdvancedKubernetesResourcesQuotaEndpointBuilder {
            public KubernetesResourcesQuotaEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new KubernetesResourcesQuotaEndpointBuilderImpl(path);
    }
}