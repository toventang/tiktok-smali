package com.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.RelativeLayout;
import com.a.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.zhiliaoapp.musically.R;

public final class f implements e {
    static {
        Covode.recordClassIndex(2011);
    }

    @Override // com.a.b.e
    public final View a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(1565);
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()));
        NiceWidthTextView niceWidthTextView = new NiceWidthTextView(context);
        niceWidthTextView.setTextSize(1, 13.0f);
        niceWidthTextView.setId(R.id.yg);
        niceWidthTextView.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), niceWidthTextView.getPaddingTop(), niceWidthTextView.getPaddingRight(), niceWidthTextView.getPaddingBottom());
        niceWidthTextView.setPadding(niceWidthTextView.getPaddingLeft(), niceWidthTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), niceWidthTextView.getPaddingBottom());
        niceWidthTextView.setBackgroundResource(R.drawable.azs);
        niceWidthTextView.setText(R.string.byp);
        niceWidthTextView.setMaxLines(1);
        niceWidthTextView.setEllipsize(TextUtils.TruncateAt.END);
        niceWidthTextView.setAllCaps(false);
        niceWidthTextView.setTypeface(Typeface.defaultFromStyle(1));
        niceWidthTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        niceWidthTextView.setFontType("medium");
        niceWidthTextView.setTextColor(resources.getColorStateList(R.color.a_));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        niceWidthTextView.setGravity(17);
        niceWidthTextView.setLineSpacing(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), 1.0f);
        a.a(niceWidthTextView);
        if (niceWidthTextView.getParent() == null) {
            relativeLayout.addView(niceWidthTextView, layoutParams);
        }
        a.a(relativeLayout);
        relativeLayout.setLayoutParams(a2);
        if (viewGroup != null && z) {
            viewGroup.addView(relativeLayout);
        }
        MethodCollector.o(1565);
        return relativeLayout;
    }
}
