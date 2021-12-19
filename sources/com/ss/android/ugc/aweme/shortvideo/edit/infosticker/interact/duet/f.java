package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.a.b;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f extends g {
    private int q;
    private int r;
    private float s = 28.0f;
    private int t;
    private VideoPublishEditModel u;
    private DuetEditStickerView v;
    private float w;
    private float x;

    static {
        Covode.recordClassIndex(83520);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return true;
    }

    public final DuetEditStickerView getDuetEditStickerView() {
        return this.v;
    }

    public final float getLastHeight() {
        return this.x;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final b a() {
        return new com.ss.android.ugc.aweme.editSticker.a.g(this, new g.a());
    }

    public final DuetStickerStruct getDuetStickerStruct() {
        DuetEditStickerView duetEditStickerView = this.v;
        if (duetEditStickerView != null) {
            return duetEditStickerView.getDuetStruct();
        }
        return null;
    }

    public final void r() {
        View view = this.f88218g;
        l.b(view, "");
        this.x = (float) view.getMeasuredHeight();
    }

    public final void setLastHeight(float f2) {
        this.x = f2;
    }

    public final void a(DuetEditStickerView duetEditStickerView) {
        MethodCollector.i(3916);
        if (duetEditStickerView == null) {
            MethodCollector.o(3916);
            return;
        }
        this.v = duetEditStickerView;
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(duetEditStickerView);
                MethodCollector.o(3916);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(3916);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(3916);
        throw nullPointerException2;
    }

    public final void a(DuetStickerStruct duetStickerStruct) {
        boolean z;
        List<DuetStickerUserStruct> userList;
        MethodCollector.i(4138);
        if (this.v == null) {
            Context context = getContext();
            l.b(context, "");
            this.v = new DuetEditStickerView(context, this.u);
            ArrayList arrayList = new ArrayList();
            if (!(duetStickerStruct == null || (userList = duetStickerStruct.getUserList()) == null)) {
                Iterator<T> it = userList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a());
                }
            }
            DuetEditStickerView duetEditStickerView = this.v;
            if (duetEditStickerView != null) {
                if (duetStickerStruct != null) {
                    z = duetStickerStruct.getOpenMic();
                } else {
                    z = false;
                }
                if (!arrayList.isEmpty()) {
                    duetEditStickerView.f127253b.addAll(arrayList);
                }
                duetEditStickerView.f127254c = z;
            }
        }
        View view = this.f88218g;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            View view2 = this.f88218g;
            if (view2 != null) {
                ((ViewGroup) view2).addView(this.v);
                MethodCollector.o(4138);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.o(4138);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(4138);
        throw nullPointerException2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, VideoPublishEditModel videoPublishEditModel) {
        super(context);
        l.d(context, "");
        l.d(videoPublishEditModel, "");
        MethodCollector.i(4148);
        this.u = videoPublishEditModel;
        this.f88212a = context;
        this.r = (int) n.b(context, 32.0f);
        int a2 = n.a(context) - this.r;
        this.q = a2;
        this.t = a2;
        this.s = n.b(context, 28.0f);
        this.w = n.b(context, 96.0f);
        LayoutInflater.from(this.f88212a).inflate(R.layout.ai2, this);
        this.f88217f = (StickerHelpBoxView) findViewById(R.id.eb3);
        this.f88218g = findViewById(R.id.ae6);
        MethodCollector.o(4148);
    }
}
