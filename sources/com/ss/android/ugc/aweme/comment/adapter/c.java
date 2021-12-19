package com.ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.e.q;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.comment.adapter.b;
import com.ss.android.ugc.aweme.comment.m.e;
import com.ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public b.AbstractC1609b f71344a;

    /* renamed from: b  reason: collision with root package name */
    public CommentAtSummonFriendItem f71345b;

    /* renamed from: c  reason: collision with root package name */
    private Aweme f71346c;

    /* renamed from: d  reason: collision with root package name */
    private final h f71347d = i.a((h.f.a.a) a.f71350a);

    static {
        Covode.recordClassIndex(43926);
    }

    private final ISearchUserService a() {
        return (ISearchUserService) this.f71347d.getValue();
    }

    static final class a extends m implements h.f.a.a<ISearchUserService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71350a = new a();

        static {
            Covode.recordClassIndex(43929);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.comment.adapter.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f71348a;

            static {
                Covode.recordClassIndex(43927);
            }

            {
                this.f71348a = r1;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Word word;
                Word word2;
                CommentAtUser commentAtUser;
                CommentAtUser commentAtUser2;
                ClickAgent.onClick(view);
                CommentAtSummonFriendItem commentAtSummonFriendItem = this.f71348a.f71345b;
                if (commentAtSummonFriendItem != null) {
                    CommentAtSummonFriendItem commentAtSummonFriendItem2 = this.f71348a.f71345b;
                    if (commentAtSummonFriendItem2 != null && commentAtSummonFriendItem2.isFromSug) {
                        d a2 = new d().a("search_position", "comments").a("new_sug_session_id", e.f72111a);
                        CommentAtSummonFriendItem commentAtSummonFriendItem3 = this.f71348a.f71345b;
                        String str6 = null;
                        if (commentAtSummonFriendItem3 != null) {
                            str = commentAtSummonFriendItem3.requestId;
                        } else {
                            str = null;
                        }
                        d a3 = a2.a("impr_id", str);
                        CommentAtSummonFriendItem commentAtSummonFriendItem4 = this.f71348a.f71345b;
                        if (commentAtSummonFriendItem4 != null) {
                            str2 = commentAtSummonFriendItem4.keyword;
                        } else {
                            str2 = null;
                        }
                        d a4 = a3.a("raw_query", str2);
                        CommentAtSummonFriendItem commentAtSummonFriendItem5 = this.f71348a.f71345b;
                        if (commentAtSummonFriendItem5 == null || (commentAtUser2 = commentAtSummonFriendItem5.mUser) == null) {
                            str3 = null;
                        } else {
                            str3 = commentAtUser2.uid;
                        }
                        d a5 = a4.a("sug_user_id", str3);
                        CommentAtSummonFriendItem commentAtSummonFriendItem6 = this.f71348a.f71345b;
                        if (commentAtSummonFriendItem6 == null || (commentAtUser = commentAtSummonFriendItem6.mUser) == null) {
                            str4 = null;
                        } else {
                            str4 = commentAtUser.relationType;
                        }
                        d a6 = a5.a("user_tag", str4).a("words_position", this.f71348a.getAdapterPosition());
                        CommentAtSummonFriendItem commentAtSummonFriendItem7 = this.f71348a.f71345b;
                        if (commentAtSummonFriendItem7 == null || (word2 = commentAtSummonFriendItem7.wordRecord) == null) {
                            str5 = null;
                        } else {
                            str5 = word2.getWordSource();
                        }
                        d a7 = a6.a("words_source", str5);
                        CommentAtSummonFriendItem commentAtSummonFriendItem8 = this.f71348a.f71345b;
                        if (!(commentAtSummonFriendItem8 == null || (word = commentAtSummonFriendItem8.wordRecord) == null)) {
                            str6 = word.getId();
                        }
                        r.a("trending_words_click", a7.a("group_id", str6).f66730a);
                    }
                    b.AbstractC1609b bVar = this.f71348a.f71344a;
                    if (bVar != null) {
                        bVar.a(this.f71348a.getPosition(), commentAtSummonFriendItem);
                    }
                }
            }
        });
        ((TuxTextView) view.findViewById(R.id.f0f)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.comment.adapter.c.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f71349a;

            static {
                Covode.recordClassIndex(43928);
            }

            {
                this.f71349a = r1;
            }

            public final void onClick(View view) {
                b.AbstractC1609b bVar;
                ClickAgent.onClick(view);
                CommentAtSummonFriendItem commentAtSummonFriendItem = this.f71349a.f71345b;
                if (commentAtSummonFriendItem != null && (bVar = this.f71349a.f71344a) != null) {
                    bVar.a(CommentAtUser.Companion.toUser(commentAtSummonFriendItem.mUser));
                }
            }
        });
    }

    private final SpannableString a(SpannableString spannableString, int i2, int i3) {
        if (TextUtils.isEmpty(spannableString)) {
            return spannableString;
        }
        int max = Math.max(0, i2);
        if (!TextUtils.isEmpty(spannableString) && max <= i3 && max < spannableString.length() && i3 <= spannableString.length()) {
            View view = this.itemView;
            l.b(view, "");
            spannableString.setSpan(new ForegroundColorSpan(view.getResources().getColor(R.color.gq)), max, i3, 17);
        }
        return spannableString;
    }

    public final void a(CommentAtSummonFriendItem commentAtSummonFriendItem, Aweme aweme, b.AbstractC1609b bVar) {
        float f2;
        String str;
        String str2 = "";
        l.d(commentAtSummonFriendItem, str2);
        if (commentAtSummonFriendItem.mUser != null) {
            View view = this.itemView;
            l.b(view, str2);
            if (commentAtSummonFriendItem.isMentionBlocked) {
                f2 = 0.3f;
            } else {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
            View view2 = this.itemView;
            l.b(view2, str2);
            Context context = view2.getContext();
            this.f71344a = bVar;
            this.f71345b = commentAtSummonFriendItem;
            this.f71346c = aweme;
            if (commentAtSummonFriendItem.mUser.nickname == null) {
                str = str2;
            } else {
                str = commentAtSummonFriendItem.mUser.nickname;
            }
            SpannableString spannableString = new SpannableString(str);
            View view3 = this.itemView;
            l.b(view3, str2);
            SmartAvatarImageView avatarImageView = ((AvatarImageWithVerify) view3.findViewById(R.id.dtn)).getAvatarImageView();
            l.b(avatarImageView, str2);
            ((com.facebook.drawee.f.a) avatarImageView.getHierarchy()).a(R.color.f159922f, q.b.f47442h);
            View view4 = this.itemView;
            l.b(view4, str2);
            ((AvatarImageWithVerify) view4.findViewById(R.id.dtn)).setUserData(new UserVerify(commentAtSummonFriendItem.mUser.avatarThumb, commentAtSummonFriendItem.mUser.customVerify, commentAtSummonFriendItem.mUser.enterpriseVerifyReason, commentAtSummonFriendItem.mUser.verificationType));
            boolean z = true;
            if (commentAtSummonFriendItem.segments != null) {
                for (Segment segment : commentAtSummonFriendItem.segments) {
                    if (segment != null) {
                        spannableString = a(spannableString, segment.begin, segment.end + 1);
                    }
                }
            } else if (commentAtSummonFriendItem.positions != null) {
                for (Position position : commentAtSummonFriendItem.positions) {
                    if (position != null) {
                        spannableString = a(spannableString, position.getBegin(), position.getEnd() + 1);
                    }
                }
            }
            View view5 = this.itemView;
            l.b(view5, str2);
            ((AvatarImageWithVerify) view5.findViewById(R.id.dtn)).a();
            View view6 = this.itemView;
            l.b(view6, str2);
            Context context2 = view6.getContext();
            String str3 = commentAtSummonFriendItem.mUser.customVerify;
            String str4 = commentAtSummonFriendItem.mUser.enterpriseVerifyReason;
            View view7 = this.itemView;
            l.b(view7, str2);
            io.a(context2, str3, str4, (TextView) view7.findViewById(R.id.f3c));
            View view8 = this.itemView;
            l.b(view8, str2);
            TuxTextView tuxTextView = (TuxTextView) view8.findViewById(R.id.f0f);
            l.b(tuxTextView, str2);
            tuxTextView.setVisibility(8);
            View view9 = this.itemView;
            l.b(view9, str2);
            TuxTextView tuxTextView2 = (TuxTextView) view9.findViewById(R.id.f7d);
            l.b(tuxTextView2, str2);
            tuxTextView2.setVisibility(0);
            ISearchUserService a2 = a();
            CommentAtUser commentAtUser = commentAtSummonFriendItem.mUser;
            String str5 = null;
            String a3 = a2.a(context, commentAtUser != null ? commentAtUser.relationType : null);
            if (a3.length() <= 0 || a3 == null) {
                ISearchUserService a4 = a();
                CommentAtUser commentAtUser2 = commentAtSummonFriendItem.mUser;
                a3 = a4.a(context, commentAtUser2 != null ? commentAtUser2.followStatus : null);
            }
            if (a3.length() <= 0) {
                z = false;
            }
            if (!z || !a().a()) {
                View view10 = this.itemView;
                l.b(view10, str2);
                TuxTextView tuxTextView3 = (TuxTextView) view10.findViewById(R.id.ezs);
                l.b(tuxTextView3, str2);
                tuxTextView3.setVisibility(8);
            } else {
                View view11 = this.itemView;
                l.b(view11, str2);
                TuxTextView tuxTextView4 = (TuxTextView) view11.findViewById(R.id.ezs);
                l.b(tuxTextView4, str2);
                tuxTextView4.setText(" · ".concat(String.valueOf(a3)));
                View view12 = this.itemView;
                l.b(view12, str2);
                TuxTextView tuxTextView5 = (TuxTextView) view12.findViewById(R.id.ezs);
                l.b(tuxTextView5, str2);
                tuxTextView5.setVisibility(0);
            }
            View view13 = this.itemView;
            l.b(view13, str2);
            TuxTextView tuxTextView6 = (TuxTextView) view13.findViewById(R.id.f7d);
            l.b(tuxTextView6, str2);
            tuxTextView6.setText(spannableString);
            View view14 = this.itemView;
            l.b(view14, str2);
            TuxTextView tuxTextView7 = (TuxTextView) view14.findViewById(R.id.f3c);
            l.b(tuxTextView7, str2);
            CommentAtUser commentAtUser3 = commentAtSummonFriendItem.mUser;
            if (commentAtUser3 != null) {
                if (!TextUtils.isEmpty(commentAtUser3.uniqueId)) {
                    str2 = commentAtUser3.uniqueId;
                } else if (commentAtUser3.shortId != null) {
                    str2 = commentAtUser3.shortId;
                }
            }
            tuxTextView7.setText(str2);
            if (commentAtSummonFriendItem.isFromSug) {
                d a5 = new d().a("search_position", "comments").a("new_sug_session_id", e.f72111a).a("impr_id", commentAtSummonFriendItem.requestId).a("raw_query", commentAtSummonFriendItem.keyword).a("sug_user_id", commentAtSummonFriendItem.mUser.uid).a("user_tag", commentAtSummonFriendItem.mUser.relationType).a("words_position", getAdapterPosition());
                Word word = commentAtSummonFriendItem.wordRecord;
                d a6 = a5.a("words_source", word != null ? word.getWordSource() : null);
                Word word2 = commentAtSummonFriendItem.wordRecord;
                if (word2 != null) {
                    str5 = word2.getId();
                }
                r.a("trending_words_show", a6.a("group_id", str5).f66730a);
            }
        }
    }
}
