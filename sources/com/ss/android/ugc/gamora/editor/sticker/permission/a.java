package com.ss.android.ugc.gamora.editor.sticker.permission;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f146748a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f146749b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(96634);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.permission.a$a  reason: collision with other inner class name */
    public static final class CallableC3933a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC3933a f146750a = new CallableC3933a();

        static {
            Covode.recordClassIndex(96635);
        }

        CallableC3933a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return ((QuestionAndAnswerApi) g.a().C().createDefaultRetrofit(QuestionAndAnswerApi.class)).getAllowUserToQuestion().a(AnonymousClass1.f146751a);
        }
    }
}
