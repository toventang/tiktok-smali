package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.i;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class LikeLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static Drawable f106273f;

    /* renamed from: a  reason: collision with root package name */
    public Queue<ImageView> f106274a;

    /* renamed from: b  reason: collision with root package name */
    public Context f106275b;

    /* renamed from: c  reason: collision with root package name */
    public int f106276c;

    /* renamed from: d  reason: collision with root package name */
    public int f106277d;

    /* renamed from: e  reason: collision with root package name */
    public Random f106278e;

    /* renamed from: g  reason: collision with root package name */
    public int f106279g;

    static {
        Covode.recordClassIndex(67945);
    }

    public LikeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LikeLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6291);
        this.f106274a = new LinkedList();
        this.f106276c = -1;
        this.f106277d = -1;
        this.f106275b = context;
        this.f106278e = new Random();
        this.f106277d = (int) n.b(context, 72.0f);
        this.f106276c = (int) n.b(context, 79.0f);
        this.f106279g = i.b(context);
        MethodCollector.o(6291);
    }
}
