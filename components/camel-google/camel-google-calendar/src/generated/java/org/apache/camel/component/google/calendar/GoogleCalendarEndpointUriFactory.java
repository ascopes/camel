/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.calendar;

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
public class GoogleCalendarEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiName/methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(40);
        props.add("backoffMultiplier");
        props.add("apiName");
        props.add("destination");
        props.add("initialDelay");
        props.add("content");
        props.add("setting");
        props.add("scheduler");
        props.add("emailAddress");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("greedy");
        props.add("clientSecret");
        props.add("text");
        props.add("scheduledExecutorService");
        props.add("ruleId");
        props.add("applicationName");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("eventId");
        props.add("p12FileName");
        props.add("clientId");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("exchangePattern");
        props.add("methodName");
        props.add("accessToken");
        props.add("backoffIdleThreshold");
        props.add("lazyStartProducer");
        props.add("contentChannel");
        props.add("delay");
        props.add("pollStrategy");
        props.add("calendarId");
        props.add("startScheduler");
        props.add("scopes");
        props.add("inBody");
        props.add("exceptionHandler");
        props.add("user");
        props.add("refreshToken");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(6);
        secretProps.add("emailAddress");
        secretProps.add("p12FileName");
        secretProps.add("clientSecret");
        secretProps.add("accessToken");
        secretProps.add("user");
        secretProps.add("refreshToken");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "google-calendar".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
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

