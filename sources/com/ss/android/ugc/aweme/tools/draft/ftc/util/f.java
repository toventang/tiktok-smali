package com.ss.android.ugc.aweme.tools.draft.ftc.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public abstract class f {
    static {
        Covode.recordClassIndex(91319);
    }

    private f() {
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final VideoPublishEditModel f139675a;

        static {
            Covode.recordClassIndex(91320);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f139675a, ((a) obj).f139675a);
            }
            return true;
        }

        public final int hashCode() {
            VideoPublishEditModel videoPublishEditModel = this.f139675a;
            if (videoPublishEditModel != null) {
                return videoPublishEditModel.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ShowMoreOption(data=" + this.f139675a + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(VideoPublishEditModel videoPublishEditModel) {
            super((byte) 0);
            l.d(videoPublishEditModel, "");
            this.f139675a = videoPublishEditModel;
        }
    }
}
