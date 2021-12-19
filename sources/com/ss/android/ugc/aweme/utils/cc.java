package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.f.b.l;
import h.f.b.m;

public final class cc {
    static {
        Covode.recordClassIndex(93382);
    }

    public static final class a extends m implements h.f.a.b<EditVideoSegment, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142762a = new a();

        static {
            Covode.recordClassIndex(93383);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(EditVideoSegment editVideoSegment) {
            EditVideoSegment editVideoSegment2 = editVideoSegment;
            l.d(editVideoSegment2, "");
            return editVideoSegment2.getVideoFileInfo().toString();
        }
    }

    public static final class b extends m implements h.f.a.b<EditVideoSegment, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f142763a = new b();

        static {
            Covode.recordClassIndex(93384);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(EditVideoSegment editVideoSegment) {
            EditVideoSegment editVideoSegment2 = editVideoSegment;
            l.d(editVideoSegment2, "");
            return String.valueOf(editVideoSegment2.getVideoCutInfo());
        }
    }
}
