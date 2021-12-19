package com.ss.android.ugc.aweme.im.sdk.relations.ui.c;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.af;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class d extends a<IMContact> {

    /* renamed from: j  reason: collision with root package name */
    public IMContact f103280j;

    /* renamed from: k  reason: collision with root package name */
    public int f103281k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final ShareDialogViewModel f103282l;

    /* renamed from: m  reason: collision with root package name */
    private final int f103283m;
    private final View n = this.itemView.findViewById(R.id.emo);
    private final TextView o = ((TextView) this.itemView.findViewById(R.id.title_tv));
    private final ImageView p = ((ImageView) this.itemView.findViewById(R.id.bnv));
    private final TuxTextView q = ((TuxTextView) this.itemView.findViewById(R.id.b_3));
    private final boolean r;

    static {
        Covode.recordClassIndex(66201);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a
    public final void b() {
        super.b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.view.ViewGroup r5, com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.c.d.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel, boolean):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a
    public final /* synthetic */ void a(IMContact iMContact, IMContact iMContact2, int i2) {
        String str;
        IMUser iMUser;
        int i3;
        IMContact iMContact3 = iMContact;
        IMContact iMContact4 = iMContact2;
        l.d(iMContact3, "");
        this.f103280j = iMContact3;
        this.f103281k = i2;
        AvatarImageView avatarImageView = this.f103267c;
        UrlModel displayAvatar = iMContact3.getDisplayAvatar();
        int i4 = this.f103283m;
        e.a(avatarImageView, displayAvatar, i4, i4);
        IMUser a2 = f.a(iMContact3);
        TuxIconView tuxIconView = this.f103268d;
        l.b(tuxIconView, "");
        af.a(tuxIconView, a2);
        if (this.f103282l.b()) {
            str = this.f103282l.c();
        } else {
            str = "";
        }
        TextView textView = this.f103269e;
        l.b(textView, "");
        com.ss.android.ugc.aweme.im.sdk.relations.b.e.a(textView, iMContact3.getDisplayName(), str);
        if (iMContact3 instanceof IMUser) {
            TextView textView2 = this.f103270f;
            l.b(textView2, "");
            IMUser iMUser2 = (IMUser) iMContact3;
            com.ss.android.ugc.aweme.im.sdk.relations.b.e.a(textView2, iMUser2.getUniqueId(), str);
            TextView textView3 = this.f103270f;
            l.b(textView3, "");
            textView3.setVisibility(0);
            TuxTextView tuxTextView = this.q;
            l.b(tuxTextView, "");
            if (!IMUser.isFriend(iMUser2.getFollowStatus()) || IMUser.isSelf(iMUser2.getUid())) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            tuxTextView.setVisibility(i3);
        } else if (iMContact3 instanceof IMConversation) {
            TextView textView4 = this.f103270f;
            l.b(textView4, "");
            IMConversation iMConversation = (IMConversation) iMContact3;
            View view = this.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            String quantityString = context.getResources().getQuantityString(R.plurals.cy, iMConversation.getConversationMemberCount(), Integer.valueOf(iMConversation.getConversationMemberCount()));
            l.b(quantityString, "");
            textView4.setText(quantityString);
            TuxTextView tuxTextView2 = this.q;
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
        a();
        List<IMContact> value = this.f103282l.f103762d.getValue();
        if (value == null) {
            value = z.INSTANCE;
        }
        TuxCheckBox tuxCheckBox = this.f103272h;
        l.b(tuxCheckBox, "");
        tuxCheckBox.setChecked(value.contains(iMContact3));
        TuxCheckBox tuxCheckBox2 = this.f103272h;
        l.b(tuxCheckBox2, "");
        tuxCheckBox2.setClickable(false);
        if (iMContact3.getType() != 3) {
            View view2 = this.n;
            l.b(view2, "");
            view2.setVisibility(8);
        } else {
            View view3 = this.n;
            l.b(view3, "");
            view3.setVisibility(0);
            ImageView imageView = this.p;
            l.b(imageView, "");
            imageView.setVisibility(8);
            TextView textView5 = this.o;
            l.b(textView5, "");
            View view4 = this.itemView;
            l.b(view4, "");
            Context context2 = view4.getContext();
            l.b(context2, "");
            textView5.setText(context2.getResources().getString(R.string.byr));
        }
        if (!this.r) {
            IMUser a3 = f.a(iMContact3);
            Boolean bool = null;
            if (iMContact4 != null) {
                iMUser = f.a(iMContact4);
            } else {
                iMUser = null;
            }
            if (a3 != null) {
                ShareDialogViewModel shareDialogViewModel = this.f103282l;
                if (shareDialogViewModel != null) {
                    bool = Boolean.valueOf(shareDialogViewModel.b());
                }
                if (!bool.booleanValue()) {
                    if ((a3.getType() == 3 || a3.getType() == 0) && (iMUser == null || (!l.a((Object) iMUser.getInitialLetter(), (Object) a3.getInitialLetter())))) {
                        TextView textView6 = this.f103271g;
                        l.b(textView6, "");
                        textView6.setVisibility(0);
                        TextView textView7 = this.f103271g;
                        l.b(textView7, "");
                        textView7.setText(a3.getInitialLetter());
                        return;
                    }
                }
            }
            TextView textView8 = this.f103271g;
            l.b(textView8, "");
            textView8.setVisibility(8);
            View view5 = this.n;
            l.b(view5, "");
            view5.setVisibility(8);
            return;
        }
        TextView textView9 = this.f103271g;
        l.b(textView9, "");
        textView9.setVisibility(8);
    }
}
