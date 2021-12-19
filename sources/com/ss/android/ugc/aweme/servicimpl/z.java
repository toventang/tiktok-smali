package com.ss.android.ugc.aweme.servicimpl;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import h.f.a.b;
import h.f.b.l;
import java.util.List;

public abstract class z<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(79959);
    }

    private z() {
    }

    public /* synthetic */ z(byte b2) {
        this();
    }

    public static final class a extends z<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public final e f121970a;

        /* renamed from: b  reason: collision with root package name */
        public final String f121971b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f121972c;

        /* renamed from: d  reason: collision with root package name */
        public final ShortVideoContext f121973d;

        /* renamed from: e  reason: collision with root package name */
        public final FaceStickerBean f121974e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f121975f;

        /* renamed from: g  reason: collision with root package name */
        public final ExtractFramesModel f121976g;

        /* renamed from: h  reason: collision with root package name */
        public final MediaModel f121977h;

        /* renamed from: i  reason: collision with root package name */
        public final b<Boolean, h.z> f121978i;

        static {
            Covode.recordClassIndex(79960);
        }

        public /* synthetic */ a(e eVar, String str, List list, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, ExtractFramesModel extractFramesModel, b bVar) {
            this(eVar, str, list, shortVideoContext, faceStickerBean, false, extractFramesModel, null, bVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, String str, List<String> list, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, ExtractFramesModel extractFramesModel, MediaModel mediaModel, b<? super Boolean, h.z> bVar) {
            super((byte) 0);
            l.d(eVar, "");
            l.d(str, "");
            l.d(shortVideoContext, "");
            l.d(bVar, "");
            this.f121970a = eVar;
            this.f121971b = str;
            this.f121972c = list;
            this.f121973d = shortVideoContext;
            this.f121974e = faceStickerBean;
            this.f121975f = z;
            this.f121976g = extractFramesModel;
            this.f121977h = mediaModel;
            this.f121978i = bVar;
        }
    }
}
