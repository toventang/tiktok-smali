package com.ss.android.ugc.aweme.ad.comment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import h.f.b.l;
import h.z;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final h f65696a = c.f65698a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f65697b = new b((byte) 0);

    public static final class b {
        static {
            Covode.recordClassIndex(40422);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final a f65698a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final c f65699b = new c();

        private c() {
        }

        static {
            Covode.recordClassIndex(40423);
        }
    }

    static {
        Covode.recordClassIndex(40420);
    }

    static final class a implements h {
        static {
            Covode.recordClassIndex(40421);
        }

        @Override // com.ss.android.ugc.aweme.ad.comment.h
        public final List<TextExtraStruct> a(s sVar, AwemeRawAd awemeRawAd, h.f.a.a<z> aVar) {
            l.d(sVar, "");
            l.d(aVar, "");
            if (sVar.getCommentStyle() == 1) {
                IAdCommentDepend iAdCommentDepend = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a;
                if (iAdCommentDepend != null) {
                    return iAdCommentDepend.a(sVar, awemeRawAd, aVar);
                }
                return null;
            }
            IAdCommentDepend iAdCommentDepend2 = com.ss.android.ugc.aweme.ad.comment.depend.a.f65679a;
            if (iAdCommentDepend2 != null) {
                return iAdCommentDepend2.a(sVar);
            }
            return null;
        }
    }
}
