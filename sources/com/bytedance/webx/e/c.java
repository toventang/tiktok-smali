package com.bytedance.webx.e;

import com.bytedance.covode.number.Covode;
import java.util.Stack;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<b> f45979a = new ThreadLocal<b>() {
        /* class com.bytedance.webx.e.c.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        public b f45981a = new b();

        static {
            Covode.recordClassIndex(28115);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ b initialValue() {
            return this.f45981a;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<a> f45980b = new ThreadLocal<a>() {
        /* class com.bytedance.webx.e.c.AnonymousClass2 */

        /* renamed from: a  reason: collision with root package name */
        public a f45982a = new a();

        static {
            Covode.recordClassIndex(28116);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ a initialValue() {
            return this.f45982a;
        }
    };

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Stack f45983a = new Stack();

        static {
            Covode.recordClassIndex(28117);
        }

        public final void a() {
            this.f45983a.push(null);
        }

        public final void b() {
            this.f45983a.pop();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Stack<com.bytedance.webx.c[]> f45984a = new Stack<>();

        static {
            Covode.recordClassIndex(28118);
        }

        public final void a() {
            this.f45984a.pop();
        }

        public final void a(com.bytedance.webx.c[] cVarArr) {
            this.f45984a.push(cVarArr);
        }
    }

    static {
        Covode.recordClassIndex(28114);
    }
}
