package com.ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Objects;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140868a = new a((byte) 0);

    static {
        Covode.recordClassIndex(91979);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91980);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        static String a(Effect effect) {
            if (effect == null) {
                return null;
            }
            List<String> tags = effect.getTags();
            if (h.a(tags)) {
                return null;
            }
            if (tags == null) {
                l.b();
            }
            for (String str : tags) {
                if (p.b(str, "challenge:", false)) {
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(10);
                    l.b(substring, "");
                    return substring;
                }
            }
            return null;
        }
    }
}
