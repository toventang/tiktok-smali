package com.ss.android.ugc.aweme.story.draft.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.ab.j;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;

public class b implements com.ss.android.ugc.aweme.shortvideo.ab.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f137021a = i.a((h.f.a.a) a.f137025a);

    /* renamed from: b  reason: collision with root package name */
    public final String f137022b;

    /* renamed from: c  reason: collision with root package name */
    public final VideoPublishEditModel f137023c;

    /* renamed from: d  reason: collision with root package name */
    public final c f137024d;

    static {
        Covode.recordClassIndex(89575);
    }

    /* access modifiers changed from: protected */
    public final DraftFileSaveException b() {
        return (DraftFileSaveException) this.f137021a.getValue();
    }

    static final class a extends m implements h.f.a.a<DraftFileSaveException> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137025a = new a();

        static {
            Covode.recordClassIndex(89576);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DraftFileSaveException invoke() {
            return new DraftFileSaveException(0, null, 3, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a
    public DraftFileSaveResult a() {
        j.a(this.f137023c);
        return new DraftFileSaveResult(0, null, 3, null);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        l.d(str, "");
        return p.a((CharSequence) str, (CharSequence) this.f137022b, false);
    }

    public b(VideoPublishEditModel videoPublishEditModel, c cVar) {
        l.d(videoPublishEditModel, "");
        l.d(cVar, "");
        this.f137023c = videoPublishEditModel;
        this.f137024d = cVar;
        this.f137022b = com.ss.android.ugc.aweme.story.base.b.b.a(videoPublishEditModel.sessionId, null);
    }
}
