package com.ss.android.ugc.aweme.share;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import java.util.List;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f124392a;

    /* renamed from: b  reason: collision with root package name */
    public static final v f124393b = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(81674);
    }

    public static final class a implements IAVProcessService.IProcessCallback<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f124394a;

        static {
            Covode.recordClassIndex(81675);
        }

        public a(j jVar) {
            this.f124394a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
        public final /* synthetic */ void finish(Integer num) {
            this.f124394a.b(Integer.valueOf(num.intValue()));
        }
    }
}
