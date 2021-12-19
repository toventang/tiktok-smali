package com.ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.mediachoose.e;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class UploadButton extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    private TextView f128740a;

    /* renamed from: b  reason: collision with root package name */
    private AnimatedImageView f128741b;

    /* renamed from: c  reason: collision with root package name */
    private Context f128742c;

    static {
        Covode.recordClassIndex(84382);
    }

    public void setText(int i2) {
        this.f128740a.setText(i2);
    }

    public UploadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private UploadButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10320);
        this.f128742c = context;
        View a2 = a.a(LayoutInflater.from(context), R.layout.bkc, this, true);
        this.f128741b = (AnimatedImageView) a2.findViewById(R.id.c2k);
        this.f128740a = (TextView) a2.findViewById(R.id.f_6);
        MethodCollector.o(10320);
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.e
    public final void a(boolean z, int i2, List<MediaModel> list, d dVar) {
        MediaModel mediaModel;
        if (!z) {
            return;
        }
        if (i2 == 1 || i2 == 3) {
            int measuredWidth = this.f128741b.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = en.a(32.0d, i.f115645a);
            }
            if (list != null && list.size() > 0 && (mediaModel = list.get(0)) != null) {
                com.ss.android.ugc.tools.c.a.a(this.f128741b, h.d(mediaModel.f109390b), measuredWidth, measuredWidth);
            }
        }
    }
}
