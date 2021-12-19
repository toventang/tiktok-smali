package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class a<T> implements WeakHandler.IHandler {

    /* renamed from: g  reason: collision with root package name */
    public static final C3319a f127617g = new C3319a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f127618c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    public boolean f127619d;

    /* renamed from: e  reason: collision with root package name */
    public T f127620e;

    /* renamed from: f  reason: collision with root package name */
    public List<d> f127621f = new LinkedList();

    static {
        Covode.recordClassIndex(83659);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(Object... objArr);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a$a  reason: collision with other inner class name */
    public static final class C3319a {
        static {
            Covode.recordClassIndex(83660);
        }

        private C3319a() {
        }

        public /* synthetic */ C3319a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        this.f127620e = t;
    }

    public boolean b(Object... objArr) {
        l.d(objArr, "");
        if (!a(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        this.f127619d = true;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.b.a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        l.d(message, "");
        this.f127619d = false;
        if (message.obj instanceof Exception) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            Exception exc = (Exception) obj;
            exc.printStackTrace();
            List<d> list = this.f127621f;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(exc);
                }
                return;
            }
            return;
        }
        a(message.obj);
        List<d> list2 = this.f127621f;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }
}
