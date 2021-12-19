package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f57872a = new n() {
        /* class com.squareup.a.n.AnonymousClass1 */

        static {
            Covode.recordClassIndex(36010);
        }

        @Override // com.squareup.a.n
        public final List<InetAddress> a(String str) {
            if (str != null) {
                return Arrays.asList(InetAddress.getAllByName(str));
            }
            throw new UnknownHostException("hostname == null");
        }
    };

    List<InetAddress> a(String str);

    static {
        Covode.recordClassIndex(36009);
    }
}
