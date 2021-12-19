package com.bytedance.ies.xbridge.system.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.system.a.b;
import com.bytedance.ies.xbridge.system.c.c;
import h.f.b.l;
import h.w;

public final class b extends com.bytedance.ies.xbridge.system.a.b {

    public enum a {
        CAMERA("android.permission.CAMERA"),
        MICROPHONE("android.permission.RECORD_AUDIO"),
        PHOTOALBUM("android.permission.READ_EXTERNAL_STORAGE"),
        VIBRATE("android.permission.VIBRATE"),
        READ_CALENDAR("android.permission.READ_CALENDAR"),
        WRITE_CALENDAR("android.permission.WRITE_CALENDAR"),
        NOTIFICATION(""),
        UNKNOWN(null);
        
        public static final C0883a Companion = new C0883a((byte) 0);
        private final String permission;

        /* renamed from: com.bytedance.ies.xbridge.system.b.b$a$a  reason: collision with other inner class name */
        public static final class C0883a {
            static {
                Covode.recordClassIndex(21869);
            }

            private C0883a() {
            }

            public /* synthetic */ C0883a(byte b2) {
                this();
            }

            public static a a(String str) {
                if (str == null) {
                    return a.UNKNOWN;
                }
                try {
                    String upperCase = str.toUpperCase();
                    l.a((Object) upperCase, "");
                    return a.valueOf(upperCase);
                } catch (Exception unused) {
                    return a.UNKNOWN;
                }
            }
        }

        public final String getPermission() {
            return this.permission;
        }

        static {
            Covode.recordClassIndex(21868);
        }

        private a(String str) {
            this.permission = str;
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.system.b.b$b  reason: collision with other inner class name */
    public enum EnumC0884b {
        PERMITTED,
        DENIED,
        UNDETERMINED,
        RESTRICTED;

        static {
            Covode.recordClassIndex(21870);
        }
    }

    static {
        Covode.recordClassIndex(21867);
    }

    @Override // com.bytedance.ies.xbridge.system.a.b
    public final void a(com.bytedance.ies.xbridge.system.c.b bVar, b.a aVar, e eVar) {
        boolean z;
        String name;
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(eVar, "");
        String str = bVar.f36491a;
        if (str == null) {
            l.a("permission");
        }
        a a2 = a.C0883a.a(str);
        if (a2 == a.UNKNOWN) {
            aVar.a(-3, "Illegal permission");
            return;
        }
        Context context = (Context) a(Context.class);
        if (context == null) {
            aVar.a(0, "Context not provided in host");
            return;
        }
        if (a2 == a.NOTIFICATION) {
            try {
                z = androidx.core.app.l.a(context).a();
            } catch (Exception e2) {
                e2.printStackTrace();
                z = false;
            }
            c cVar = new c();
            if (z) {
                name = EnumC0884b.PERMITTED.name();
                if (name == null) {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                name = EnumC0884b.DENIED.name();
                if (name == null) {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            String lowerCase = name.toLowerCase();
            l.a((Object) lowerCase, "");
            cVar.f36493a = lowerCase;
            aVar.a((b.a) cVar, (c) "");
        }
        String permission = a2.getPermission();
        if (permission == null) {
            return;
        }
        if (androidx.core.content.b.a(context, permission) == 0) {
            c cVar2 = new c();
            String name2 = EnumC0884b.PERMITTED.name();
            if (name2 != null) {
                String lowerCase2 = name2.toLowerCase();
                l.a((Object) lowerCase2, "");
                cVar2.f36493a = lowerCase2;
                aVar.a((b.a) cVar2, (c) "");
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
        c cVar3 = new c();
        String name3 = EnumC0884b.DENIED.name();
        if (name3 != null) {
            String lowerCase3 = name3.toLowerCase();
            l.a((Object) lowerCase3, "");
            cVar3.f36493a = lowerCase3;
            aVar.a((b.a) cVar3, (c) "");
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
