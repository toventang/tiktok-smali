package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView;
import com.ss.android.ugc.aweme.editSticker.interact.view.g;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

public final class c extends g {
    float q;
    private int r;
    private int s;
    private float t = 28.0f;
    private int u;
    private PollingStickerView v;
    private float w;

    static {
        Covode.recordClassIndex(83607);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.interact.view.g
    public final boolean p() {
        return true;
    }

    public final PollingStickerView getBaseView() {
        return this.v;
    }

    public final void r() {
        this.q = (float) this.f88218g.getMeasuredHeight();
    }

    public final void a(PollingStickerView pollingStickerView) {
        MethodCollector.i(5808);
        if (pollingStickerView == null) {
            MethodCollector.o(5808);
            return;
        }
        this.v = pollingStickerView;
        ((ViewGroup) this.f88218g).removeAllViews();
        ((ViewGroup) this.f88218g).addView(pollingStickerView);
        MethodCollector.o(5808);
    }

    public final float b(PollingStickerView pollingStickerView) {
        float height = (this.q - ((float) this.v.getHeight())) * this.f88213b;
        if (height >= 0.0f || !m.a(pollingStickerView.getPollStruct().getQuestion())) {
            return height / 2.0f;
        }
        return height;
    }

    public c(Context context) {
        super(context);
        MethodCollector.i(5729);
        this.f88212a = context;
        this.s = (int) n.b(context, 32.0f);
        int a2 = n.a(context) - this.s;
        this.r = a2;
        this.u = a2;
        this.t = n.b(context, 28.0f);
        this.w = n.b(context, 96.0f);
        LayoutInflater.from(this.f88212a).inflate(R.layout.aib, this);
        this.f88217f = (StickerHelpBoxView) findViewById(R.id.eb3);
        this.f88218g = findViewById(R.id.ae6);
        MethodCollector.o(5729);
    }

    public final void a(PollStruct pollStruct) {
        MethodCollector.i(5817);
        if (this.v == null) {
            PollingStickerView pollingStickerView = new PollingStickerView(getContext());
            this.v = pollingStickerView;
            pollingStickerView.setTouchEnable(true);
            this.v.setEditEnable(false);
            if (pollStruct != null && !b.a((Collection) pollStruct.getOptions())) {
                this.v.a(pollStruct);
            }
            this.v.a();
        }
        ((ViewGroup) this.f88218g).removeAllViews();
        ((ViewGroup) this.f88218g).addView(this.v);
        MethodCollector.o(5817);
    }
}
