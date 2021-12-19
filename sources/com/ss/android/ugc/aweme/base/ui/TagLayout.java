package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.h.f;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.commercialize.utils.af;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.ui.ay;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TagLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f68327a = Arrays.asList("People you may know", "follows_you", "from your contacts");

    /* renamed from: f  reason: collision with root package name */
    public static final a f68328f = new a(20);

    /* renamed from: g  reason: collision with root package name */
    private static final int f68329g = n.a(5.0d);

    /* renamed from: b  reason: collision with root package name */
    public Context f68330b;

    /* renamed from: c  reason: collision with root package name */
    public String f68331c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f68332d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f68333e;

    /* renamed from: h  reason: collision with root package name */
    private int f68334h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f68335i;

    private void b() {
        TextView textView = this.f68333e;
        if (textView != null) {
            removeView(textView);
        }
    }

    private static int getMutualLablesTotalWidth() {
        double b2 = (double) i.b(d.a());
        Double.isNaN(b2);
        return (int) (b2 * 0.65d);
    }

    static {
        Covode.recordClassIndex(42068);
    }

    private boolean a() {
        if (!g.b() || this.f68332d.getInteractionTagInfo() == null || this.f68332d.getInteractionTagInfo().getInterestLevel() != InteractionTagInterestLevel.HIGH.getLevel() || TextUtils.isEmpty(this.f68332d.getInteractionTagInfo().getVideoLabelText())) {
            return false;
        }
        return true;
    }

    public void setEventType(String str) {
        this.f68331c = str;
    }

    public void setFeedFromPage(int i2) {
        this.f68334h = i2;
    }

    public void setFromPostPage(boolean z) {
        this.f68335i = z;
    }

    public TagLayout(Context context) {
        this(context, null);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f68341a = 7;

        /* renamed from: b  reason: collision with root package name */
        public final int f68342b;

        static {
            Covode.recordClassIndex(42071);
        }

        public a(int i2) {
            this.f68342b = i2;
        }

        public final int a(Context context) {
            return (i.b(context) - f.b(Integer.valueOf(this.f68341a))) - f.b(120);
        }
    }

    private boolean a(Aweme aweme) {
        List<String> geofencingRegions;
        if (this.f68335i && (geofencingRegions = aweme.getGeofencingRegions()) != null && !geofencingRegions.isEmpty()) {
            return true;
        }
        return false;
    }

    private void setSocialVideoTagView(String str) {
        if (this.f68332d.getInteractionTagInfo() != null) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                removeView(childAt);
            }
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) com.bytedance.common.utility.n.b(this.f68330b, 19.0f));
            LinearLayout linearLayout = (LinearLayout) com.a.a(LayoutInflater.from(this.f68330b), R.layout.so, this, false);
            TuxTag tuxTag = (TuxTag) linearLayout.findViewById(R.id.f1e);
            tuxTag.setTagSize(3);
            tuxTag.setText(str);
            tuxTag.setTagTextColor(this.f68330b.getResources().getColor(R.color.bx));
            tuxTag.setTagBackgroundColor(this.f68330b.getResources().getColor(R.color.f159928l));
            addView(linearLayout, 0, layoutParams);
        }
    }

    private void setGeoFencingTag(Aweme aweme) {
        String str;
        a(1, getChildCount());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) com.bytedance.common.utility.n.b(this.f68330b, 19.0f));
        layoutParams.leftMargin = (int) com.bytedance.common.utility.n.b(this.f68330b, 0.0f);
        View childAt = getChildAt(0);
        if (childAt != null) {
            removeView(childAt);
        }
        LinearLayout linearLayout = (LinearLayout) com.a.a(LayoutInflater.from(this.f68330b), R.layout.sp, this, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(b.c(getContext(), R.color.aa));
        gradientDrawable.setCornerRadius(com.bytedance.common.utility.n.b(this.f68330b, 2.0f));
        linearLayout.setBackground(gradientDrawable);
        ((RemoteImageView) linearLayout.findViewById(R.id.byf)).setImageResource(2131231544);
        TextView textView = (TextView) linearLayout.findViewById(R.id.f1e);
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions == null || geofencingRegions.isEmpty()) {
            str = "";
        } else if (geofencingRegions.size() == 1) {
            str = this.f68330b.getString(R.string.cb1, geofencingRegions.get(0));
        } else {
            str = this.f68330b.getString(R.string.cb0, geofencingRegions.get(0), Integer.valueOf(geofencingRegions.size() - 1));
        }
        textView.setText(str);
        textView.setTextColor(b.c(getContext(), R.color.c5));
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        addView(linearLayout, 0, layoutParams);
    }

    private void setMutualTagView(MutualStruct mutualStruct) {
        if (mutualStruct != null && TextUtils.equals(this.f68331c, "homepage_hot")) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                removeView(childAt);
            }
            if (!hh.b() || this.f68332d.getRelationRecommendInfo() == null) {
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) com.bytedance.common.utility.n.b(this.f68330b, 22.0f));
                LinearLayout linearLayout = (LinearLayout) com.a.a(LayoutInflater.from(this.f68330b), R.layout.afy, this, false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(b.c(this.f68330b, R.color.f159928l));
                gradientDrawable.setCornerRadius(com.bytedance.common.utility.n.b(this.f68330b, 2.0f));
                linearLayout.setBackground(gradientDrawable);
                MutualRelationView mutualRelationView = (MutualRelationView) linearLayout.findViewById(R.id.eem);
                mutualRelationView.a(mutualStruct, e.e());
                mutualRelationView.f144502a.setTuxFont(62);
                mutualRelationView.setTextColor(b.c(this.f68330b, R.color.bx));
                mutualRelationView.setTvMaxWidth(getMutualLablesTotalWidth());
                addView(linearLayout, 0, layoutParams);
            }
        }
    }

    public final View a(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getTag() instanceof Integer) && i2 == ((Integer) childAt.getTag()).intValue()) {
                return childAt;
            }
        }
        return null;
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private void a(int i2, int i3) {
        if (i2 < i3) {
            while (i2 < i3) {
                removeView(getChildAt(i2));
                i2++;
            }
        }
    }

    private static TextView a(TuxTextView tuxTextView, AwemeTextLabelModel awemeTextLabelModel) {
        af.a(tuxTextView, awemeTextLabelModel);
        tuxTextView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        tuxTextView.setText(awemeTextLabelModel.getLabelName());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        tuxTextView.setGravity(16);
        tuxTextView.setBackgroundDrawable(o.a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) n.a(4.0d)));
        int i2 = f68329g;
        tuxTextView.setPadding(i2, 0, i2, 0);
        tuxTextView.setSingleLine();
        tuxTextView.setMaxEms(20);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setVisibility(0);
        tuxTextView.setAlpha(1.0f);
        return tuxTextView;
    }

    private void a(Aweme aweme, a aVar) {
        if (!(aweme == null || aweme.getTextVideoLabels() == null)) {
            a(aweme.getTextVideoLabels().size(), getChildCount());
            for (int i2 = 0; i2 < aweme.getTextVideoLabels().size(); i2++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) com.bytedance.common.utility.n.b(this.f68330b, (float) aVar.f68342b));
                if (i2 == 0) {
                    layoutParams.leftMargin = (int) com.bytedance.common.utility.n.b(this.f68330b, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) com.bytedance.common.utility.n.b(this.f68330b, (float) aVar.f68341a);
                }
                AwemeTextLabelModel awemeTextLabelModel = aweme.getTextVideoLabels().get(i2);
                if (awemeTextLabelModel != null) {
                    View childAt = getChildAt(i2);
                    if (childAt == null) {
                        TuxTextView tuxTextView = new TuxTextView(getContext());
                        addView(tuxTextView, -1, layoutParams);
                        a(tuxTextView, awemeTextLabelModel);
                    } else if (childAt instanceof TuxTextView) {
                        a((TuxTextView) getChildAt(i2), awemeTextLabelModel);
                    } else {
                        removeView(childAt);
                        TuxTextView tuxTextView2 = new TuxTextView(getContext());
                        addView(tuxTextView2, i2, layoutParams);
                        a(tuxTextView2, awemeTextLabelModel);
                    }
                }
            }
        }
    }

    private void a(List<AwemeLabelModel> list, a aVar) {
        if (list != null) {
            a(list.size(), getChildCount());
            for (int i2 = 0; i2 < list.size(); i2++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) com.bytedance.common.utility.n.b(this.f68330b, (float) aVar.f68342b));
                if (i2 == 0) {
                    layoutParams.leftMargin = (int) com.bytedance.common.utility.n.b(this.f68330b, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) com.bytedance.common.utility.n.b(this.f68330b, (float) aVar.f68341a);
                }
                AwemeLabelModel awemeLabelModel = list.get(i2);
                View childAt = getChildAt(i2);
                if (childAt != null && !(childAt instanceof RemoteImageView)) {
                    removeView(childAt);
                    childAt = null;
                }
                RemoteImageView remoteImageView = (RemoteImageView) childAt;
                if (awemeLabelModel != null) {
                    if (remoteImageView == null) {
                        remoteImageView = new RemoteImageView(this.f68330b);
                        addView(remoteImageView, i2, layoutParams);
                    } else {
                        remoteImageView.setLayoutParams(layoutParams);
                    }
                    remoteImageView.setVisibility(0);
                    remoteImageView.setAlpha(1.0f);
                    UrlModel urlModels = awemeLabelModel.getUrlModels();
                    int labelType = awemeLabelModel.getLabelType();
                    remoteImageView.setTag(Integer.valueOf(labelType));
                    remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    if (labelType == 3) {
                        remoteImageView.setVisibility(8);
                        removeView(remoteImageView);
                    } else {
                        com.ss.android.ugc.aweme.base.e.a(remoteImageView, urlModels, new ay(remoteImageView, this.f68330b));
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.ss.android.ugc.aweme.feed.model.Aweme r17, com.ss.android.ugc.aweme.base.ui.TagLayout.a r18) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.TagLayout.b(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.base.ui.TagLayout$a):void");
    }

    private TagLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(10277);
        this.f68334h = -1;
        this.f68330b = context;
        MethodCollector.o(10277);
    }

    public final void b(Aweme aweme, List<AwemeLabelModel> list, a aVar) {
        this.f68332d = aweme;
        b();
        int i2 = 8;
        if (aweme == null || TextUtils.equals(this.f68331c, "westwindow")) {
            setVisibility(8);
            return;
        }
        if (a(aweme)) {
            setGeoFencingTag(aweme);
        } else if (a()) {
            setSocialVideoTagView(aweme.getInteractionTagInfo().getVideoLabelText());
        } else if (aweme.getMutualRelation() != null && e.b()) {
            setMutualTagView(aweme.getMutualRelation());
        } else if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
            b(aweme, aVar);
        } else if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            a(list, aVar);
        } else {
            a(aweme, aVar);
        }
        if (getChildCount() > 0) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void c(Aweme aweme, List<AwemeLabelModel> list, a aVar) {
        boolean z;
        String str;
        int i2;
        this.f68332d = aweme;
        b();
        int i3 = 8;
        if (aweme == null) {
            setVisibility(8);
            return;
        }
        if (a()) {
            setSocialVideoTagView(aweme.getInteractionTagInfo().getVideoLabelText());
        } else if (aweme.getMutualRelation() != null && e.b()) {
            setMutualTagView(aweme.getMutualRelation());
        } else if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
            b(aweme, aVar);
        } else if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            a(list, aVar);
            RelationDynamicLabel relationLabel = aweme.getRelationLabel();
            if (relationLabel != null && relationLabel.isValid()) {
                int i4 = 16;
                if (this.f68333e == null) {
                    TuxTextView tuxTextView = new TuxTextView(getContext());
                    tuxTextView.setTuxFont(61);
                    tuxTextView.setTextColor(d.a().getResources().getColor(R.color.iv));
                    tuxTextView.setGravity(16);
                    tuxTextView.setBackgroundDrawable(o.a(d.a().getResources().getColor(R.color.f159928l), (float) n.a(4.0d)));
                    int i5 = f68329g;
                    tuxTextView.setPadding(i5, 0, i5, 0);
                    tuxTextView.setSingleLine();
                    this.f68333e = tuxTextView;
                }
                String nickname = relationLabel.getNickname();
                String labelInfo = relationLabel.getLabelInfo();
                if (getChildCount() > 0) {
                    z = true;
                    i4 = 15;
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(nickname)) {
                    str = com.ss.android.ugc.aweme.base.utils.b.a(labelInfo, i4, "");
                } else {
                    String concat = "@".concat(String.valueOf(nickname));
                    float f2 = (float) i4;
                    float f3 = 0.0f;
                    if (labelInfo != null) {
                        int i6 = -1;
                        while (true) {
                            float f4 = 1.0f;
                            int i7 = i6 + 1;
                            if (i7 >= labelInfo.length()) {
                                break;
                            }
                            int i8 = 2;
                            if (com.ss.android.ugc.aweme.base.utils.b.a(labelInfo, i7) != 2) {
                                if (com.ss.android.ugc.aweme.base.utils.b.b(labelInfo, i7)) {
                                    f4 = 0.5f;
                                }
                                i8 = 1;
                            }
                            i6 += i8;
                            f3 += f4;
                        }
                    }
                    String a2 = com.ss.android.ugc.aweme.base.utils.b.a(concat, (int) Math.ceil((double) (f2 - f3)), com.ss.android.ugc.aweme.base.utils.b.f68427a);
                    if (!TextUtils.isEmpty(a2)) {
                        a2 = a2 + " ";
                    }
                    str = a2 + labelInfo;
                }
                this.f68333e.setText(str);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (z) {
                    i2 = n.a(6.0d);
                } else {
                    i2 = 0;
                }
                layoutParams.leftMargin = i2;
                addView(this.f68333e, layoutParams);
            }
        } else {
            a(aweme, aVar);
        }
        if (getChildCount() > 0) {
            i3 = 0;
        }
        setVisibility(i3);
    }

    public final void a(Aweme aweme, List<AwemeLabelModel> list, a aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (list.get(i2).getLabelType() != 100) {
                    arrayList.add(list.get(i2));
                    break;
                } else {
                    i2++;
                }
            }
        }
        b(aweme, arrayList, aVar);
    }

    private static void a(Aweme aweme, int i2, Integer num, AwemeHybridLabelModel awemeHybridLabelModel, TuxTextView tuxTextView) {
        if (aweme.getAuthor() != null) {
            tuxTextView.setMaxLines(1);
            tuxTextView.setMaxWidth(i2);
            if (num != null) {
                i2 = num.intValue();
            }
            com.ss.android.ugc.aweme.social.ext.a.a(tuxTextView, null, aweme, Integer.valueOf(i2));
            return;
        }
        tuxTextView.setText(awemeHybridLabelModel.getText());
    }
}
