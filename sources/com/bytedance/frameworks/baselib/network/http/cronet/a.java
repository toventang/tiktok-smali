package com.bytedance.frameworks.baselib.network.http.cronet;

import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile EnumC0621a f28995a = EnumC0621a.NormalStart;

    /* renamed from: b  reason: collision with root package name */
    public static volatile EnumC0621a f28996b = EnumC0621a.Default;

    /* renamed from: c  reason: collision with root package name */
    private static final String f28997c = a.class.getSimpleName();

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a$a  reason: collision with other inner class name */
    public enum EnumC0621a {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2),
        WeakNet(3),
        Default(4);
        
        public final int state;

        public final int getValue() {
            return this.state;
        }

        static {
            Covode.recordClassIndex(17009);
        }

        private EnumC0621a(int i2) {
            this.state = i2;
        }
    }

    static {
        Covode.recordClassIndex(17008);
    }
}
