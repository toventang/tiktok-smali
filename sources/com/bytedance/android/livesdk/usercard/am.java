package com.bytedance.android.livesdk.usercard;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.ui.dp;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class am extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public View.OnClickListener f21822a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21823b;

    /* renamed from: c  reason: collision with root package name */
    private List<ImageModel> f21824c;

    static {
        Covode.recordClassIndex(12853);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<ImageModel> list = this.f21824c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public am(boolean z) {
        this.f21823b = z;
    }

    public final void a(List<ImageModel> list) {
        if (!b.a((Collection) list)) {
            if (this.f21824c == null) {
                this.f21824c = new ArrayList();
            }
            this.f21824c.clear();
            this.f21824c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final int f21825a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f21826b = ((ImageView) this.itemView.findViewById(R.id.etk));

        /* renamed from: c  reason: collision with root package name */
        TextView f21827c;

        /* renamed from: d  reason: collision with root package name */
        boolean f21828d;

        static {
            Covode.recordClassIndex(12854);
        }

        public a(View view, boolean z) {
            super(view);
            this.f21828d = z;
            TextView textView = (TextView) this.itemView.findViewById(R.id.etl);
            this.f21827c = textView;
            textView.setMovementMethod(new LinkMovementMethod());
            this.f21825a = y.a(16.0f);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        if (!b.a((Collection) this.f21824c) && i2 < this.f21824c.size()) {
            ImageModel imageModel = this.f21824c.get(i2);
            View.OnClickListener onClickListener = this.f21822a;
            if (imageModel == null) {
                return;
            }
            if (imageModel.getImageType() == 7 || imageModel.getImageType() == 5 || imageModel.getImageType() == 6) {
                n.a(aVar2.f21826b, 8);
            } else if (imageModel.getImageType() == 3) {
                n.a(aVar2.f21826b, 8);
                n.a(aVar2.f21827c, 0);
                String a2 = y.a((int) R.string.efv);
                if (aVar2.f21828d) {
                    SpannableString spannableString = new SpannableString(a2);
                    spannableString.setSpan(new dp(a2, y.b((int) R.color.a0y), y.a(11.0f), y.b((int) R.color.a0x), y.a(9.0f)), 0, spannableString.length(), 33);
                    aVar2.f21827c.setText(spannableString);
                    return;
                }
                aVar2.f21827c.setText(a2);
            } else {
                p.a(aVar2.f21826b, imageModel, -1, -1, true, 0, new p.a() {
                    /* class com.bytedance.android.livesdk.usercard.am.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(12855);
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel) {
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel, Exception exc) {
                    }

                    @Override // com.bytedance.android.live.core.f.p.a
                    public final void a(ImageModel imageModel, int i2, int i3) {
                        if (i3 > 0 && i2 > 0) {
                            ViewGroup.LayoutParams layoutParams = a.this.f21826b.getLayoutParams();
                            int i4 = a.this.f21825a;
                            layoutParams.height = i4;
                            layoutParams.width = (i2 * i4) / i3;
                            a.this.f21826b.setLayoutParams(layoutParams);
                        }
                    }
                });
                View view = aVar2.itemView;
                if (view != null) {
                    view.setOnClickListener(onClickListener);
                    view.setClickable(true);
                }
                aVar2.itemView.setTag(imageModel);
            }
        }
    }

    private static RecyclerView.ViewHolder a(am amVar, ViewGroup viewGroup, int i2) {
        int i3;
        boolean a2;
        MethodCollector.i(1074);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (amVar.f21823b) {
            i3 = R.layout.bec;
        } else {
            i3 = R.layout.beb;
        }
        a aVar = new a(com.a.a(from, i3, viewGroup, false), amVar.f21823b);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(1074);
        return aVar;
    }
}
