/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class NettyEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":protocol://host:port";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(74);
        props.add("usingExecutorService");
        props.add("disconnect");
        props.add("enabledProtocols");
        props.add("synchronous");
        props.add("hostnameVerification");
        props.add("keyStoreFormat");
        props.add("producerPoolMinIdle");
        props.add("ssl");
        props.add("bossGroup");
        props.add("protocol");
        props.add("bridgeErrorHandler");
        props.add("securityProvider");
        props.add("delimiter");
        props.add("host");
        props.add("connectTimeout");
        props.add("options");
        props.add("textline");
        props.add("workerGroup");
        props.add("producerPoolMinEvictableIdle");
        props.add("tcpNoDelay");
        props.add("udpConnectionlessSending");
        props.add("needClientAuth");
        props.add("sslHandler");
        props.add("encoders");
        props.add("keyStoreFile");
        props.add("decoders");
        props.add("reuseAddress");
        props.add("encoding");
        props.add("sync");
        props.add("workerCount");
        props.add("lazyStartProducer");
        props.add("backlog");
        props.add("port");
        props.add("producerPoolMaxTotal");
        props.add("networkInterface");
        props.add("allowDefaultCodec");
        props.add("passphrase");
        props.add("clientMode");
        props.add("nettyServerBootstrapFactory");
        props.add("decoderMaxLineLength");
        props.add("exceptionHandler");
        props.add("broadcast");
        props.add("trustStoreResource");
        props.add("bossCount");
        props.add("serverInitializerFactory");
        props.add("sslClientCertHeaders");
        props.add("disconnectOnNoReply");
        props.add("useByteBuf");
        props.add("sslContextParameters");
        props.add("correlationManager");
        props.add("keyStoreResource");
        props.add("autoAppendDelimiter");
        props.add("reuseChannel");
        props.add("producerPoolMaxIdle");
        props.add("reconnect");
        props.add("producerPoolEnabled");
        props.add("trustStoreFile");
        props.add("noReplyLogLevel");
        props.add("transferExchange");
        props.add("requestTimeout");
        props.add("receiveBufferSizePredictor");
        props.add("keepAlive");
        props.add("clientInitializerFactory");
        props.add("sendBufferSize");
        props.add("exchangePattern");
        props.add("reconnectInterval");
        props.add("lazyChannelCreation");
        props.add("allowSerializedHeaders");
        props.add("channelGroup");
        props.add("receiveBufferSize");
        props.add("serverClosedChannelExceptionCaughtLogLevel");
        props.add("nativeTransport");
        props.add("udpByteArrayCodec");
        props.add("serverExceptionCaughtLogLevel");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(1);
        secretProps.add("passphrase");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("option.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "netty".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "protocol", null, true, copy);
        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

