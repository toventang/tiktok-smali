package com.ss.android.ugc.aweme.challenge.g;

import android.os.Message;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.Objects;

public final class f extends b<SearchSugChallengeList> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69982a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f69983b;

    /* renamed from: c  reason: collision with root package name */
    private k f69984c;

    static {
        Covode.recordClassIndex(43145);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43146);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.b
    public final /* bridge */ /* synthetic */ void handleData(SearchSugChallengeList searchSugChallengeList) {
        if (searchSugChallengeList != null) {
            this.mData = searchSugChallengeList;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        l.d(message, "");
        if (message.what != this.f69983b) {
            this.mHandler.removeMessages(message.what);
            return;
        }
        if (message.obj instanceof Exception) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            Exception exc = (Exception) obj;
            if (exc.getMessage() != null) {
                bj.b("challenge search failed, message:" + exc.getMessage());
            }
            bj.b("challenge search failed, stack trace:" + Log.getStackTraceString(exc));
        }
        if (!(message.obj instanceof j)) {
            super.handleMsg(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        l.d(objArr, "");
        if (in.d()) {
            return false;
        }
        if (!super.sendRequest(objArr[0], objArr[1])) {
            return false;
        }
        this.f69983b = (this.f69983b + 1) % 10;
        k kVar = this.f69984c;
        if (kVar != null) {
            kVar.f69986a = true;
        }
        this.f69984c = new k(this, objArr);
        n.a().a(this.mHandler, this.f69984c, this.f69983b);
        return true;
    }
}
