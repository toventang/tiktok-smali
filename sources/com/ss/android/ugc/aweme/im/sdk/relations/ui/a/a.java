package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class a extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    protected int f103173a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f103174b = false;

    /* renamed from: c  reason: collision with root package name */
    protected List<IMContact> f103175c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f103176d;

    /* renamed from: e  reason: collision with root package name */
    protected String f103177e;

    /* renamed from: f  reason: collision with root package name */
    public LinkedHashSet<IMContact> f103178f = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    protected View f103179g;

    /* renamed from: h  reason: collision with root package name */
    protected RecyclerView f103180h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayoutManager f103181i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f103182j;

    /* renamed from: k  reason: collision with root package name */
    public AbstractC2618a f103183k;

    /* renamed from: l  reason: collision with root package name */
    protected RecyclerView.n f103184l;

    /* renamed from: m  reason: collision with root package name */
    private Animator.AnimatorListener f103185m = new Animator.AnimatorListener() {
        /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(66159);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            a.this.notifyDataSetChanged();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a$a  reason: collision with other inner class name */
    public interface AbstractC2618a {
        static {
            Covode.recordClassIndex(66160);
        }

        void a(View view, int i2);
    }

    static {
        Covode.recordClassIndex(66157);
    }

    /* access modifiers changed from: protected */
    public abstract String a(IMContact iMContact);

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final IMContact[] a() {
        return (IMContact[]) this.f103178f.toArray(new IMContact[0]);
    }

    public final int b() {
        if (this.f103179g != null) {
            return 1;
        }
        return 0;
    }

    public class b extends com.ss.android.ugc.aweme.im.sdk.common.ui.base.a<IMContact> {

        /* renamed from: a  reason: collision with root package name */
        protected TuxCheckBox f103188a;

        /* renamed from: b  reason: collision with root package name */
        protected int f103189b = Math.round(n.b(d.a(), 16.0f));

        /* renamed from: c  reason: collision with root package name */
        protected int f103190c = (((int) n.b(d.a(), -32.0f)) - 1);

        /* renamed from: e  reason: collision with root package name */
        private AvatarImageView f103192e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f103193f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f103194g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f103195h;

        /* renamed from: i  reason: collision with root package name */
        private ImageView f103196i;

        /* renamed from: j  reason: collision with root package name */
        private TuxIconView f103197j;

        /* renamed from: k  reason: collision with root package name */
        private View f103198k;

        static {
            Covode.recordClassIndex(66161);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.a
        public final void a() {
            super.a();
            this.itemView.setBackground(c.c(this.itemView.getContext()));
        }

        public final Animator d() {
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f103190c, this.f103189b);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(66163);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (b.this.f103188a != null) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b.this.f103188a.getLayoutParams();
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        b.this.f103188a.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        public final Animator e() {
            ValueAnimator ofInt = ValueAnimator.ofInt(this.f103189b, this.f103190c);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.b.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(66164);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (b.this.f103188a != null) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b.this.f103188a.getLayoutParams();
                        marginLayoutParams.setMargins(intValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        b.this.f103188a.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.a
        public void b() {
            super.b();
            this.f103198k = this.itemView.findViewById(R.id.ca6);
            this.f103192e = (AvatarImageView) this.itemView.findViewById(R.id.pf);
            this.f103188a = (TuxCheckBox) this.itemView.findViewById(R.id.a5_);
            this.f103193f = (TextView) this.itemView.findViewById(R.id.csg);
            this.f103194g = (TextView) this.itemView.findViewById(R.id.al5);
            this.f103197j = (TuxIconView) this.itemView.findViewById(R.id.b7o);
            this.f103195h = (TextView) this.itemView.findViewById(R.id.title_tv);
            this.f103196i = (ImageView) this.itemView.findViewById(R.id.fez);
        }

        public b(View view) {
            super(view);
            view.setTag(this);
        }

        public void a(IMContact iMContact, int i2) {
            int i3;
            if (iMContact.getType() != -1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f103188a.getLayoutParams();
                if (a.this.f103176d) {
                    if (a.this.f103178f.contains(iMContact)) {
                        this.f103188a.setChecked(true);
                    } else {
                        this.f103188a.setChecked(false);
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    int marginStart = marginLayoutParams.getMarginStart();
                    int i5 = this.f103189b;
                    if (marginStart != i5) {
                        marginLayoutParams.setMargins(i5, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        marginLayoutParams.setMarginStart(this.f103189b);
                        this.f103188a.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    this.f103188a.setChecked(false);
                    int i6 = Build.VERSION.SDK_INT;
                    int marginStart2 = marginLayoutParams.getMarginStart();
                    int i7 = this.f103190c;
                    if (marginStart2 != i7) {
                        marginLayoutParams.setMargins(i7, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        marginLayoutParams.setMarginStart(this.f103190c);
                        this.f103188a.setLayoutParams(marginLayoutParams);
                    }
                }
                if (iMContact.getType() == 2) {
                    this.f103195h.setText(R.string.ch_);
                    this.f103195h.setVisibility(0);
                    this.f103198k.setVisibility(8);
                } else if (iMContact.getType() == 3) {
                    View view = this.f103198k;
                    if (i2 == 0) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                    this.f103195h.setText(R.string.cgb);
                    this.f103195h.setVisibility(0);
                } else {
                    this.f103195h.setVisibility(8);
                    this.f103198k.setVisibility(8);
                }
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                    e.a(this.f103192e, 2131232324);
                } else {
                    e.a(this.f103192e, displayAvatar);
                }
                IMUser a2 = f.a(iMContact);
                if (a2 != null) {
                    io.a(this.itemView.getContext(), a2.getCustomVerify(), a2.getEnterpriseVerifyReason(), this.f103193f);
                    a.a(this.f103193f, a2, a.this.f103177e);
                    if (!TextUtils.isEmpty(a.this.a(iMContact)) && !TextUtils.isEmpty(a.this.f103177e)) {
                        a.b(this.f103194g, a2, a.this.f103177e);
                    } else if (TextUtils.isEmpty(a.this.a(iMContact))) {
                        this.f103194g.setVisibility(8);
                    } else {
                        this.f103194g.setVisibility(0);
                        this.f103194g.setText(a.this.a(iMContact));
                    }
                    if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a(a2)) {
                        this.f103197j.setVisibility(8);
                    } else if (a2.getFollowStatus() == 2) {
                        this.f103197j.setVisibility(0);
                    } else {
                        this.f103197j.setVisibility(8);
                    }
                } else {
                    io.a(this.itemView.getContext(), "", "", this.f103193f);
                    this.f103194g.setVisibility(8);
                    this.f103197j.setVisibility(8);
                    if (TextUtils.isEmpty(a.this.f103177e)) {
                        this.f103193f.setText(iMContact.getDisplayName());
                    } else {
                        a.a(this.f103193f, iMContact.getDisplayName(), a.this.f103177e, 0);
                    }
                }
                if (a.this.f103183k != null) {
                    this.itemView.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(66162);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            a.this.f103183k.a(b.this.itemView, b.this.getAdapterPosition());
                        }
                    });
                }
                this.f103192e.setTag(50331648, 50331649);
                this.f103192e.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, 50331648);
                this.itemView.setTag(83886080, iMContact);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        List<IMContact> list = this.f103175c;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f103175c.size();
    }

    private void c() {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builder = null;
        for (int i2 = 0; i2 < this.f103181i.s(); i2++) {
            View g2 = this.f103181i.g(i2);
            if (g2 != null) {
                b bVar = (b) g2.getTag();
                if (builder == null) {
                    builder = animatorSet.play(bVar.e());
                } else {
                    builder.with(bVar.e());
                }
            }
        }
        animatorSet.setDuration(300L);
        animatorSet.addListener(this.f103185m);
        animatorSet.start();
    }

    public void a(int i2) {
        notifyItemChanged(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f103180h = null;
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i2) {
        if (i2 < b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (this.f103175c.get(i2).getType() == -1) {
            return -1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f103180h = recyclerView;
        this.f103181i = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (this.f103184l == null) {
            this.f103184l = new RecyclerView.n() {
                /* class com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(66158);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.n
                public final void a(RecyclerView recyclerView, int i2) {
                    super.a(recyclerView, i2);
                    int n = a.this.f103181i.n();
                    if (a.this.f103173a == 0 && n == a.this.getItemCount() - 1 && a.this.f103182j != null) {
                        k.a(a.this.f103182j);
                    }
                }
            };
        }
        this.f103180h.a(this.f103184l);
    }

    public final void a(List<IMContact> list) {
        this.f103177e = null;
        this.f103175c.clear();
        this.f103173a = 0;
        this.f103175c.addAll(list);
        if (this.f103175c.isEmpty()) {
            IMUser iMUser = new IMUser();
            iMUser.setType(-1);
            this.f103175c.add(iMUser);
        } else if (this.f103175c.size() != 1 || this.f103175c.get(0).getType() != -1) {
            if (this.f103175c.get(0).getType() == -1) {
                this.f103175c.remove(0);
            }
        } else {
            return;
        }
        notifyDataSetChanged();
    }

    public final void a(boolean z) {
        if (this.f103176d != z) {
            this.f103176d = z;
            if (!z) {
                this.f103178f.clear();
            }
            if (this.f103176d) {
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet.Builder builder = null;
                for (int i2 = 0; i2 < this.f103181i.s(); i2++) {
                    View g2 = this.f103181i.g(i2);
                    if (g2 != null) {
                        b bVar = (b) g2.getTag();
                        if (builder == null) {
                            builder = animatorSet.play(bVar.d());
                        } else {
                            builder.with(bVar.d());
                        }
                    }
                }
                animatorSet.setDuration(300L);
                animatorSet.addListener(this.f103185m);
                animatorSet.start();
                return;
            }
            c();
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i2) {
        bVar.a(this.f103175c.get(i2), i2);
    }

    public b a(ViewGroup viewGroup, int i2) {
        int i3;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            i3 = R.layout.a6j;
        } else {
            i3 = R.layout.a6i;
        }
        return new b(com.a.a(from, i3, viewGroup, false));
    }

    public final void a(List<IMContact> list, CharSequence charSequence) {
        this.f103173a = 1;
        this.f103177e = charSequence.toString();
        this.f103175c.clear();
        this.f103175c.addAll(list);
        notifyDataSetChanged();
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        b a3 = aVar.a(viewGroup, i2);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        return a3;
    }

    protected static void a(TextView textView, IMUser iMUser, String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            textView.setText(iMUser.getDisplayId());
            return;
        }
        String displayId = iMUser.getDisplayId();
        if (!TextUtils.isEmpty(displayId) && !displayId.contains(str) && (indexOf = displayId.toLowerCase().indexOf((str = str.toLowerCase()))) != -1) {
            str = displayId.substring(indexOf, Math.min(str.length() + indexOf, displayId.length()));
        }
        a(textView, iMUser.getDisplayId(), str, 0);
    }

    protected static void b(TextView textView, IMUser iMUser, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (iMUser.getSearchType() == 5) {
                if (!TextUtils.isEmpty(iMUser.getSignature())) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                }
                textView.setVisibility(8);
            } else if (iMUser.getSearchType() != 3) {
                String str2 = "";
                if (iMUser.getSearchType() == 1) {
                    String displayId = iMUser.getDisplayId();
                    String lowerCase = com.ss.android.ugc.aweme.im.sdk.relations.b.a.c(displayId).toLowerCase();
                    if (!TextUtils.isEmpty(displayId)) {
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < displayId.length(); i2++) {
                            sb.append(com.github.a.a.a.a(displayId.charAt(i2)).charAt(0));
                        }
                        str2 = sb.toString();
                    }
                    str = com.ss.android.ugc.aweme.im.sdk.relations.b.a.a(displayId, lowerCase, str2, str);
                    a(textView, d.a().getResources().getString(R.string.cch) + displayId, str, 4);
                    textView.setVisibility(0);
                } else {
                    if (iMUser.getSearchType() == 2) {
                        str = com.ss.android.ugc.aweme.im.sdk.relations.b.a.a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str);
                        a(textView, str2, str, 6);
                        textView.setVisibility(0);
                    }
                    textView.setVisibility(8);
                }
            } else if (TextUtils.isEmpty(iMUser.getRemarkName())) {
                if (!TextUtils.isEmpty(iMUser.getSignature())) {
                    textView.setText(iMUser.getSignature());
                    textView.setVisibility(0);
                }
                textView.setVisibility(8);
            } else {
                String string = d.a().getResources().getString(R.string.cgi, iMUser.getNickName());
                str = com.ss.android.ugc.aweme.im.sdk.relations.b.a.a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
                a(textView, string, str, 3);
                textView.setVisibility(0);
            }
            if (TextUtils.isEmpty(iMUser.getDisplayName())) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(iMUser.getDisplayName());
            textView.setVisibility(0);
            a(textView, iMUser.getDisplayName(), str, 0);
        } else if (TextUtils.isEmpty(iMUser.getDisplayName())) {
            textView.setVisibility(8);
        } else {
            textView.setText(iMUser.getDisplayName());
            textView.setVisibility(0);
        }
    }

    protected static void a(TextView textView, String str, String str2, int i2) {
        textView.setText(com.ss.android.ugc.aweme.im.sdk.relations.b.d.a(androidx.core.content.b.c(textView.getContext(), R.color.al), str, str2, i2));
    }
}
