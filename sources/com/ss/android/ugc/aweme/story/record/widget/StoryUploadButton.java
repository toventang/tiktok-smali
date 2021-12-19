package com.ss.android.ugc.aweme.story.record.widget;

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
import com.ss.android.ugc.tools.view.widget.AnimatedImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class StoryUploadButton extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    public Context f138494a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f138495b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f138496c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatedImageView f138497d;

    static {
        Covode.recordClassIndex(90592);
    }

    public void setText(int i2) {
        this.f138496c.setText(i2);
    }

    public StoryUploadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private StoryUploadButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(2654);
        this.f138494a = context;
        View a2 = a.a(LayoutInflater.from(context), R.layout.b38, this, true);
        this.f138497d = (AnimatedImageView) a2.findViewById(R.id.c2k);
        this.f138496c = (TextView) a2.findViewById(R.id.f_6);
        MethodCollector.o(2654);
    }

    @Override // com.ss.android.ugc.aweme.mediachoose.e
    public final void a(boolean z, int i2, List<MediaModel> list, d dVar) {
        MediaModel mediaModel;
        if (!z) {
            return;
        }
        if (i2 == 1 || i2 == 3) {
            int measuredWidth = this.f138497d.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = en.a(32.0d, i.f115645a);
            }
            if (list != null && list.size() > 0 && (mediaModel = list.get(0)) != null) {
                com.ss.android.ugc.tools.c.a.a(this.f138497d, mediaModel.f109390b, measuredWidth, measuredWidth);
            }
        }
    }
}
