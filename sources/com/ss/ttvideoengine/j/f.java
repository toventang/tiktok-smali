package com.ss.ttvideoengine.j;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.k.j;
import com.ss.ttvideoengine.k.k;
import com.ss.ttvideoengine.s.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f152900a;

    /* renamed from: b  reason: collision with root package name */
    public Object f152901b;

    /* renamed from: c  reason: collision with root package name */
    public k f152902c = new j();

    /* renamed from: d  reason: collision with root package name */
    public a f152903d;

    /* renamed from: e  reason: collision with root package name */
    Handler f152904e;

    /* renamed from: f  reason: collision with root package name */
    private Object f152905f;

    /* renamed from: g  reason: collision with root package name */
    private Object f152906g;

    public interface a {
        static {
            Covode.recordClassIndex(101664);
        }

        void a();

        void a(com.ss.ttvideoengine.s.c cVar);
    }

    static {
        Covode.recordClassIndex(101663);
    }

    public final void a(String str) {
        com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "setTokenUrlTemplate enter");
        if (this.f152901b != null) {
            try {
                if (this.f152900a == null) {
                    this.f152900a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                }
                this.f152900a.getDeclaredMethod("setTokenUrlTemplate", String.class).invoke(this.f152901b, str);
            } catch (ClassNotFoundException e2) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
            } catch (NoSuchMethodException e3) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e3.getLocalizedMessage());
            } catch (IllegalAccessException e4) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            } catch (InvocationTargetException e5) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e5.getLocalizedMessage());
            }
        }
    }

    public final int b() {
        com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "start enter");
        if (this.f152901b == null) {
            return -1;
        }
        try {
            if (this.f152900a == null) {
                this.f152900a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.f152900a.getDeclaredMethod("start", new Class[0]).invoke(this.f152901b, new Object[0])).intValue();
        } catch (ClassNotFoundException e2) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e3) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e3.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e4) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e5) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e5.getLocalizedMessage());
            return -1;
        }
    }

    public final int c() {
        com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "stop enter");
        if (this.f152901b == null) {
            return -1;
        }
        try {
            if (this.f152900a == null) {
                this.f152900a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.f152900a.getDeclaredMethod("stop", new Class[0]).invoke(this.f152901b, new Object[0])).intValue();
        } catch (ClassNotFoundException e2) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e3) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e3.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e4) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e5) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e5.getLocalizedMessage());
            return -1;
        }
    }

    public final void a() {
        com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "release enter");
        if (this.f152901b != null) {
            try {
                if (this.f152900a == null) {
                    this.f152900a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                }
                this.f152900a.getDeclaredMethod("release", new Class[0]).invoke(this.f152901b, new Object[0]);
                this.f152901b = null;
            } catch (ClassNotFoundException e2) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
            } catch (NoSuchMethodException e3) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e3.getLocalizedMessage());
            } catch (IllegalAccessException e4) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            } catch (InvocationTargetException e5) {
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e5.getLocalizedMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements InvocationHandler {
        static {
            Covode.recordClassIndex(101666);
        }

        private c() {
        }

        /* synthetic */ c(f fVar, byte b2) {
            this();
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            int i2;
            String str;
            com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "intertrust listener invoke");
            String name = method.getName();
            if (name.equals("onTokenProcessed")) {
                f fVar = f.this;
                fVar.f152904e.sendMessage(fVar.f152904e.obtainMessage(0));
                return null;
            } else if (name.equals("onError")) {
                int i3 = -1;
                if (objArr[0] != null) {
                    i2 = ((Integer) objArr[0]).intValue();
                } else {
                    i2 = -1;
                }
                if (objArr[1] != null) {
                    i3 = ((Integer) objArr[1]).intValue();
                }
                if (objArr[2] != null) {
                    str = objArr[2].toString();
                } else {
                    str = "";
                }
                if (i2 == -600000) {
                    i2 = -9935;
                } else if (i2 == -600001) {
                    i2 = -9934;
                }
                f.this.a(new com.ss.ttvideoengine.s.c("kTTVideoErrorDomainIntertrustDRM", i2, i3, str));
                return null;
            } else {
                com.ss.ttvideoengine.s.j.c("IntertrustDrmHelper", "invalid method name:".concat(String.valueOf(name)));
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements InvocationHandler {
        static {
            Covode.recordClassIndex(101667);
        }

        private d() {
        }

        /* synthetic */ d(f fVar, byte b2) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.ss.ttvideoengine.k.k */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            Map map;
            com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "network listener invoke");
            String name = method.getName();
            if (name.equals("startTask")) {
                if (objArr[0] != null) {
                    str = objArr[0].toString();
                } else {
                    str = "";
                }
                if (objArr[1] != null) {
                    map = (Map) objArr[1];
                } else {
                    map = null;
                }
                f.this.f152902c.a(str, map, new e());
            } else if (name.equals("cancel")) {
                f.this.f152902c.a();
            } else {
                com.ss.ttvideoengine.s.j.c("IntertrustDrmHelper", "invalid method name:".concat(String.valueOf(name)));
            }
            return null;
        }
    }

    class e implements k.b {
        static {
            Covode.recordClassIndex(101668);
        }

        e() {
        }

        @Override // com.ss.ttvideoengine.k.k.b
        public final void a(String str, com.ss.ttvideoengine.s.c cVar) {
            if (cVar != null) {
                String str2 = cVar.f153263d;
                com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "get token return error code: " + cVar.f153260a + ", internal:" + cVar.f153261b + ", description:" + cVar.f153263d);
                if (!str2.contains("Canceled")) {
                    f.this.a(cVar);
                }
            } else if (f.this.f152901b != null) {
                try {
                    if (f.this.f152900a == null) {
                        f.this.f152900a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                    }
                    f.this.f152900a.getDeclaredMethod("processTokenComplete", String.class).invoke(f.this.f152901b, str);
                } catch (ClassNotFoundException e2) {
                    com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
                } catch (NoSuchMethodException e3) {
                    com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e3.getLocalizedMessage());
                } catch (IllegalAccessException e4) {
                    com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
                } catch (InvocationTargetException e5) {
                    com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e5.getLocalizedMessage());
                }
            }
        }
    }

    public final void a(com.ss.ttvideoengine.s.c cVar) {
        this.f152904e.sendMessage(this.f152904e.obtainMessage(1, cVar));
    }

    /* access modifiers changed from: package-private */
    public class b extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<f> f152908b;

        static {
            Covode.recordClassIndex(101665);
        }

        public final void handleMessage(Message message) {
            a aVar;
            f fVar = this.f152908b.get();
            if (fVar != null && (aVar = fVar.f152903d) != null) {
                int i2 = message.what;
                if (i2 == 0) {
                    aVar.a();
                } else if (i2 == 1) {
                    aVar.a((com.ss.ttvideoengine.s.c) message.obj);
                }
            }
        }

        public b(f fVar, Looper looper) {
            super(looper);
            this.f152908b = new WeakReference<>(fVar);
        }
    }

    public final int a(Context context, int i2) {
        Object obj;
        com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "init enter");
        try {
            Class<?> cls = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            this.f152900a = cls;
            this.f152901b = cls.newInstance();
            Class<?> cls2 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyListener");
            c cVar = new c(this, (byte) 0);
            this.f152905f = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{cls2}, cVar);
            this.f152900a.getDeclaredMethod("setListener", cls2).invoke(this.f152901b, this.f152905f);
            Class<?> cls3 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyNetworkClient");
            d dVar = new d(this, (byte) 0);
            this.f152906g = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{cls3}, dVar);
            this.f152900a.getDeclaredMethod("setNetworkClient", cls3).invoke(this.f152901b, this.f152906g);
            if (i2 == 0) {
                obj = this.f152900a.getDeclaredMethod("init", Context.class).invoke(this.f152901b, context);
            } else {
                obj = this.f152900a.getDeclaredMethod("init", Context.class, Integer.TYPE).invoke(this.f152901b, context, Integer.valueOf(i2));
            }
            this.f152904e = new b(this, i.a());
            return ((Integer) obj).intValue();
        } catch (ClassNotFoundException e2) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
            return -1002;
        } catch (InstantiationException e3) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "instance failed+" + e3.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e4) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "illegal access exception:" + e4.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e5) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e5.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e6) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "invoke failed:" + e6.getLocalizedMessage());
            return -1;
        }
    }

    public final String a(String str, int i2) {
        com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "makeUrl enter");
        if (this.f152901b == null) {
            return null;
        }
        try {
            if (this.f152900a == null) {
                this.f152900a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return (String) this.f152900a.getDeclaredMethod("makeUrl", String.class, Integer.TYPE).invoke(this.f152901b, str, Integer.valueOf(i2));
        } catch (ClassNotFoundException e2) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
            return null;
        } catch (NoSuchMethodException e3) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e3.getLocalizedMessage());
            return null;
        } catch (IllegalAccessException e4) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return null;
        } catch (InvocationTargetException e5) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e5.getLocalizedMessage());
            return null;
        }
    }

    public final int a(int i2, String str, String str2) {
        com.ss.ttvideoengine.s.j.b("IntertrustDrmHelper", "processToken enter");
        if (this.f152901b == null) {
            return -1;
        }
        try {
            if (this.f152900a == null) {
                this.f152900a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.f152900a.getDeclaredMethod("processToken", Integer.TYPE, String.class, String.class).invoke(this.f152901b, Integer.valueOf(i2), str, str2)).intValue();
        } catch (ClassNotFoundException e2) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "class not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e3) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method not found:" + e3.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e4) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e5) {
            com.ss.ttvideoengine.s.j.e("IntertrustDrmHelper", "method invoke failied:" + e5.getLocalizedMessage());
            return -1;
        }
    }
}
