package jd.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.appwork.utils.net.httpconnection.HTTPProxy;

public class StaticProxySelector implements ProxySelectorInterface {

    private HTTPProxy       proxy;
    private List<HTTPProxy> lst;

    public StaticProxySelector(final HTTPProxy proxy) {
        this.proxy = proxy;
        lst = new ArrayList<HTTPProxy>();
        lst.add(proxy);
    }

    public HTTPProxy getProxy() {
        return proxy;
    }

    @Override
    public List<HTTPProxy> getProxiesByUrl(final String url) {
        return lst;
    }

    @Override
    public boolean updateProxy(final Request request, final int retryCounter) {
        return false;
    }

    @Override
    public boolean reportConnectException(Request request, int retryCounter, IOException e) {
        return false;
    }

}
