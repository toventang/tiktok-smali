package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.e;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;

public final class DmtCutMusicLayout extends b {

    /* renamed from: a  reason: collision with root package name */
    private f f126313a;

    /* renamed from: b  reason: collision with root package name */
    private e f126314b;

    /* renamed from: c  reason: collision with root package name */
    private final int f126315c;

    /* renamed from: d  reason: collision with root package name */
    private String f126316d;

    static {
        Covode.recordClassIndex(82901);
    }

    public DmtCutMusicLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void a() {
        a(0.0f);
        setTimeBubble(0);
        f fVar = this.f126313a;
        if (fVar == null) {
            l.a("cutMusicScrollView");
        }
        fVar.setScrollDx(0.0f);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void setAudioWaveViewData(d dVar) {
        f fVar = this.f126313a;
        if (fVar == null) {
            l.a("cutMusicScrollView");
        }
        fVar.setAudioWaveViewData(dVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void setBubbleText(String str) {
        e eVar = this.f126314b;
        if (eVar == null) {
            l.a("bubbleTextView");
        }
        eVar.setText(str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void setBubbleTextViewAttribute(e.a aVar) {
        l.d(aVar, "");
        e eVar = this.f126314b;
        if (eVar == null) {
            l.a("bubbleTextView");
        }
        eVar.setAttribute(aVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void setScrollListener(f.a aVar) {
        l.d(aVar, "");
        f fVar = this.f126313a;
        if (fVar == null) {
            l.a("cutMusicScrollView");
        }
        fVar.setScrollListener(aVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void a(float f2) {
        f fVar = this.f126313a;
        if (fVar == null) {
            l.a("cutMusicScrollView");
        }
        fVar.post(new f.e(fVar, f2));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void b(float f2) {
        f fVar = this.f126313a;
        if (fVar == null) {
            l.a("cutMusicScrollView");
        }
        a aVar = fVar.O;
        if (aVar == null) {
            l.a("cutMusicView");
        }
        aVar.f126331c = (int) fVar.P;
        aVar.f126330b = f2;
        d dVar = aVar.f126329a;
        dVar.f126349e = aVar.f126331c;
        dVar.f126350f = aVar.f126331c + aVar.f126332d;
        aVar.invalidate();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.b
    public final void setTimeBubble(int i2) {
        String str = this.f126316d;
        if (str == null) {
            l.a("bubbleText");
        }
        String a2 = a.a(str, Arrays.copyOf(new Object[]{k.b.a((long) i2)}, 1));
        l.b(a2, "");
        setBubbleText(a2);
    }

    private /* synthetic */ DmtCutMusicLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DmtCutMusicLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, 0, 0);
        l.b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, -16777216);
        this.f126315c = color;
        obtainStyledAttributes.recycle();
        e eVar = new e(context, (byte) 0);
        this.f126314b = eVar;
        eVar.setId(R.id.ewb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) n.b(context, 8.0f);
        layoutParams.leftMargin = (int) n.b(context, 8.0f);
        layoutParams.addRule(9);
        e eVar2 = this.f126314b;
        if (eVar2 == null) {
            l.a("bubbleTextView");
        }
        eVar2.setLayoutParams(layoutParams);
        e eVar3 = this.f126314b;
        if (eVar3 == null) {
            l.a("bubbleTextView");
        }
        addView(eVar3);
        f fVar = new f(context, (byte) 0);
        this.f126313a = fVar;
        fVar.setId(R.id.f38);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.ewb);
        f fVar2 = this.f126313a;
        if (fVar2 == null) {
            l.a("cutMusicScrollView");
        }
        fVar2.setLayoutParams(layoutParams2);
        f fVar3 = this.f126313a;
        if (fVar3 == null) {
            l.a("cutMusicScrollView");
        }
        addView(fVar3);
        f fVar4 = this.f126313a;
        if (fVar4 == null) {
            l.a("cutMusicScrollView");
        }
        fVar4.setWaveColor(color);
        String string = getResources().getString(R.string.b46);
        l.b(string, "");
        this.f126316d = string;
    }
}
