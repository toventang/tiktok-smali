package com.ss.android.ugc.aweme.comment.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.ad.comment.a.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.adapter.CommentPreCreateViewHolderManager;
import com.ss.android.ugc.aweme.comment.barrage.a.c;
import com.ss.android.ugc.aweme.comment.barrage.d;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentTaggedPeopleView;
import com.ss.android.ugc.aweme.comment.f.j;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.comment.util.k;
import com.ss.android.ugc.aweme.comment.util.v;
import com.ss.android.ugc.aweme.comment.widget.CommentDescView;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.widget.b;
import com.ss.android.ugc.aweme.feed.widget.i;
import com.ss.android.ugc.aweme.feed.widget.j;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bv;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class a extends f<Comment> implements ad {
    private HashSet<String> A;
    private com.ss.android.ugc.aweme.ad.comment.a.a B;

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.g.a f71318a;

    /* renamed from: b  reason: collision with root package name */
    public String f71319b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f71320c;

    /* renamed from: d  reason: collision with root package name */
    public String f71321d;

    /* renamed from: e  reason: collision with root package name */
    public v f71322e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f71323f;

    /* renamed from: g  reason: collision with root package name */
    public c f71324g;

    /* renamed from: h  reason: collision with root package name */
    public DataCenter f71325h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap<Long, Long> f71326i;

    /* renamed from: j  reason: collision with root package name */
    private h f71327j;

    /* renamed from: k  reason: collision with root package name */
    private final int f71328k;
    private final int w;
    private final int x;
    private HashSet<Comment> y;
    private CommentPreCreateViewHolderManager z;

    static {
        Covode.recordClassIndex(43912);
    }

    private static boolean b(int i2) {
        return i2 == 1 || i2 == 0 || i2 == 10 || i2 == 12;
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final List<Comment> e() {
        return this.f76354l;
    }

    @Override // com.ss.android.ugc.aweme.comment.adapter.ad
    public final int[] a() {
        return new int[]{1, 2};
    }

    public final void a(String str) {
        boolean z2;
        if (c() != 0) {
            for (int i2 = 0; i2 < this.f76354l.size(); i2++) {
                Comment comment = (Comment) this.f76354l.get(i2);
                if (comment != null && m.a(comment.getCid(), str)) {
                    String authorUid = this.f71327j.getAuthorUid();
                    if (comment.getUserDigged() == 1) {
                        comment.setUserDigged(0);
                        comment.setDiggCount(comment.getDiggCount() - 1);
                    } else {
                        comment.setUserDigged(1);
                        comment.setDiggCount(comment.getDiggCount() + 1);
                    }
                    if (TextUtils.equals(authorUid, b.g().getCurUserId()) && comment.getLabelType() != 1) {
                        if (comment.getUserDigged() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        comment.setAuthorDigged(z2);
                    }
                    notifyItemChanged(i2, 0);
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.c(2, new Object[]{this.f71327j.getAid(), comment}));
                    return;
                }
            }
        }
    }

    public final void a(String str, int i2) {
        int c2 = c();
        if (c2 != 0 && !TextUtils.isEmpty(str)) {
            int i3 = -1;
            int i4 = 0;
            while (true) {
                if (i4 >= c2) {
                    break;
                }
                Comment comment = (Comment) this.f76354l.get(i4);
                if (comment == null || !m.a(comment.getCid(), str)) {
                    i4++;
                } else {
                    if (comment.getGift() != null) {
                        String str2 = this.f71319b;
                        String aid = this.f71327j.getAid();
                        String authorUid = this.f71327j.getAuthorUid();
                        Long valueOf = Long.valueOf(comment.getGift().getId());
                        d a2 = com.ss.android.ugc.aweme.comment.m.c.a(str2, aid);
                        a2.a("enter_from", str2);
                        a2.a("group_id", aid);
                        a2.a("author_id", authorUid);
                        a2.a("gift_id", valueOf);
                        r.a("delete_gift_from_comment", a2.f66730a);
                    }
                    i3 = i4;
                }
            }
            a(i3, i2);
        }
    }

    public final void a(Set<String> set, Map<String, Comment> map) {
        Comment comment;
        List<Comment> l2 = l();
        for (String str : set) {
            if (this.f76354l.size() > 0 && (comment = map.get(str)) != null) {
                int indexOf = this.f76354l.indexOf(comment);
                if (indexOf >= 0) {
                    int d2 = this.f71322e.d(comment.getCid());
                    if (d2 > 1) {
                        List list = this.f76354l;
                        list.subList(indexOf, Math.min(list.size(), d2 + indexOf)).clear();
                    } else {
                        this.f76354l.remove(indexOf);
                    }
                } else {
                    CommentReplyListItem e2 = this.f71322e.e(comment.getReplyId());
                    if (e2 != null) {
                        if (e2.mReplyComments.indexOf(comment) >= 0 && e2.mButtonStruct != null) {
                            e2.mButtonStruct.setReplyCommentTotal(e2.mComment.getReplyCommentTotal() - 1);
                            int intValue = Integer.valueOf(e2.mButtonStruct.getCid()).intValue() + e2.mButtonStruct.getTopSize() + 1;
                            if (e2.mButtonStruct.getReplyCommentTotal() <= ((long) e2.mButtonStruct.getTopSize())) {
                                this.f76354l.remove(intValue);
                            } else {
                                notifyDataSetChanged();
                            }
                        }
                        e2.mComment.setReplyCommentTotal(e2.mComment.getReplyCommentTotal() - 1);
                        e2.mReplyComments.remove(comment);
                    }
                }
                a(comment);
            }
        }
        bv.a(this, l2, this.f76354l);
    }

    public final void a(Comment comment, String str, String str2) {
        String cid;
        int indexOf;
        String str3;
        String str4;
        String str5;
        String str6;
        if (comment != null) {
            int i2 = -1;
            if (comment.getCommentType() == 2) {
                cid = comment.getReplyId();
                indexOf = this.f71322e.f(cid);
                List<Comment> b2 = this.f71322e.b(String.valueOf(indexOf));
                if (b2 != null) {
                    i2 = b2.indexOf(comment);
                }
            } else if (comment.getCommentType() == 1) {
                cid = comment.getCid();
                indexOf = this.f71322e.f(cid);
            } else {
                cid = comment.getCid();
                indexOf = this.f76354l.indexOf(comment);
            }
            if (TextUtils.isEmpty(comment.getReplyToReplyCommentId()) || TextUtils.equals(comment.getReplyToReplyCommentId(), "0")) {
                str3 = (TextUtils.isEmpty(comment.getReplyId()) || TextUtils.equals(comment.getReplyId(), "0")) ? "original" : "reply";
            } else {
                str3 = "reply_to_reply";
            }
            String str7 = "";
            if (comment.getUser() == null || comment.getUser().getUid() == null) {
                str4 = str7;
            } else {
                str4 = comment.getUser().getUid();
            }
            if (TextUtils.equals("reply_via_video", str)) {
                com.ss.android.ugc.aweme.comment.m.b.a(str2, this.f71327j.getAid(), comment.getCid(), str4, cid, indexOf + 1, i2 + 1, str3, this.f71327j.getEnterFrom(), this.f71327j.getInsertCids(), !TextUtils.equals(this.f71327j.getAuthorUid(), b.g().getCurUserId()) ? 1 : 0);
                return;
            }
            if (!(comment.getAliasAweme() == null || comment.getAliasAweme().getAid() == null)) {
                str7 = comment.getAliasAweme().getAid();
            }
            if (TextUtils.equals("click_comment_chain", this.f71319b) || TextUtils.equals("click_comment_bubble", this.f71319b) || TextUtils.equals("collection_comment", this.f71319b)) {
                str5 = this.f71319b;
                if (TextUtils.isEmpty(this.f71327j.getEnterMethod())) {
                    str6 = this.f71319b;
                } else {
                    str6 = this.f71327j.getEnterMethod();
                }
            } else if (TextUtils.equals("message", this.f71319b) || TextUtils.equals("push", this.f71319b)) {
                str5 = TextUtils.equals("message", this.f71319b) ? "notification" : this.f71319b;
                str6 = this.f71319b;
            } else {
                str6 = this.f71319b;
                str5 = "click_comment_button";
            }
            com.ss.android.ugc.aweme.comment.m.b.a(str5, this.f71327j.getAid(), comment.getCid(), str4, cid, indexOf + 1, i2 + 1, str3, str6, str7);
        }
    }

    public final void a(boolean z2) {
        Comment comment;
        HashMap<Long, Long> hashMap = this.f71326i;
        if (hashMap != null) {
            for (Map.Entry<Long, Long> entry : hashMap.entrySet()) {
                Long key = entry.getKey();
                Comment comment2 = new Comment();
                comment2.setCid(String.valueOf(key));
                int indexOf = this.f76354l.indexOf(comment2);
                if (indexOf >= 0 && (comment = (Comment) this.f76354l.get(indexOf)) != null) {
                    if (z2) {
                        a(key.longValue(), System.currentTimeMillis());
                        if (comment.isAuthorDigged()) {
                            com.ss.android.ugc.aweme.comment.m.b.b(this.f71319b, this.f71327j.getAid(), this.f71327j.getAuthorUid(), comment.getCid());
                        }
                    } else {
                        a((Comment) this.f76354l.get(indexOf));
                        System.currentTimeMillis();
                        entry.setValue(0L);
                    }
                }
            }
        }
    }

    public final void a(Comment comment, int i2) {
        if (comment != null) {
            List<Comment> l2 = l();
            this.f76354l.add(i2, comment);
            bv.a(this, l2, this.f76354l);
        }
    }

    public final void d() {
        HashSet<String> hashSet = this.A;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    private List<Comment> l() {
        if (this.f76354l == null) {
            this.f76354l = new ArrayList();
        }
        return new ArrayList(this.f76354l);
    }

    private h d(ViewGroup viewGroup) {
        return new h(viewGroup, this.f71318a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.a.f
    public final /* bridge */ /* synthetic */ void a(Comment comment) {
        a(comment, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.a$a  reason: collision with other inner class name */
    public static class C1608a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f71330a;

        static {
            Covode.recordClassIndex(43914);
        }

        C1608a(View view) {
            super(view);
            this.f71330a = (TextView) view.findViewById(R.id.f4x);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final int c_(View view) {
        return (int) n.b(view.getContext(), 45.0f);
    }

    private x c(ViewGroup viewGroup) {
        return new x(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.is, viewGroup, false), this.f71318a);
    }

    private static C1608a e(ViewGroup viewGroup) {
        return new C1608a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.j1, viewGroup, false));
    }

    private Rect a(int i2) {
        int c2;
        int i3 = this.w;
        int c3 = c(i2);
        if (i2 >= c() - 1) {
            c2 = -1;
        } else {
            c2 = c(i2 + 1);
        }
        if (b(c3) && !b(c2)) {
            i3 = this.f71328k;
        }
        return new Rect(-1, this.w, -1, i3);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        if (this.f76354l != null) {
            int commentType = ((Comment) this.f76354l.get(i2)).getCommentType();
            if (commentType == 0) {
                return 0;
            }
            int i3 = 1;
            if (commentType != 1) {
                i3 = 2;
                if (commentType != 2) {
                    i3 = 221;
                    if (commentType != 221) {
                        i3 = 222;
                        if (commentType != 222) {
                            switch (commentType) {
                                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                    return 10;
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                    return 11;
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                    return 12;
                            }
                        }
                    }
                }
            }
            return i3;
        }
        return super.c(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        CommentTaggedPeopleView commentTaggedPeopleView;
        DataCenter dataCenter;
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof s) {
            s sVar = (s) viewHolder;
            sVar.e();
            Comment comment = sVar.f71415a;
        } else if (viewHolder instanceof h) {
            h hVar = (h) viewHolder;
            if (hVar.A != null && (hVar.itemView.getContext() instanceof e) && com.ss.android.ugc.aweme.comment.a.c.a()) {
                hVar.A.a().removeObserver(hVar.B);
            }
            Comment comment2 = hVar.y;
        } else if (viewHolder instanceof f) {
            ((f) viewHolder).c();
        } else if ((viewHolder instanceof r) && (dataCenter = (commentTaggedPeopleView = ((r) viewHolder).f71407e).f71712a) != null) {
            dataCenter.b("TAGGED_PEOPLE_ACTION", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) commentTaggedPeopleView);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final void a(RecyclerView.ViewHolder viewHolder) {
        super.a(viewHolder);
        View view = viewHolder.itemView;
        int i2 = this.x;
        view.setPadding(i2, i2, i2, i2);
        viewHolder.itemView.setLayoutParams(new RecyclerView.j(-1, -2));
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void c(List<Comment> list) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            List<Comment> l2 = l();
            this.f76354l.addAll(list);
            bv.a(this, l2, this.f76354l);
        }
    }

    private void a(Comment comment) {
        long j2;
        String cid;
        int indexOf;
        String str;
        String str2;
        String valueOf;
        String valueOf2;
        String str3;
        if (comment != null && !TextUtils.isEmpty(this.f71319b)) {
            try {
                j2 = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j2 = 0;
            }
            HashMap<Long, Long> hashMap = this.f71326i;
            if (hashMap != null && hashMap.get(Long.valueOf(j2)) != null && this.f71326i.get(Long.valueOf(j2)).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - this.f71326i.get(Long.valueOf(j2)).longValue();
                if (currentTimeMillis > 30) {
                    String predictedAgeGroup = b.g().getCurUser().getPredictedAgeGroup();
                    String predictedAgeGroup2 = comment.getUser().getPredictedAgeGroup();
                    int i2 = -1;
                    String str4 = "";
                    if (comment.getCommentType() == 2) {
                        cid = comment.getReplyId();
                        indexOf = this.f71322e.f(cid);
                        str = comment.getCid();
                        List<Comment> b2 = this.f71322e.b(String.valueOf(indexOf));
                        if (b2 != null) {
                            i2 = b2.indexOf(comment);
                        }
                        str2 = "2";
                    } else if (comment.getCommentType() == 1) {
                        cid = comment.getCid();
                        indexOf = this.f71322e.f(cid);
                        str2 = "1";
                        str = str4;
                    } else {
                        cid = comment.getCid();
                        indexOf = this.f76354l.indexOf(comment);
                        str = str4;
                        str2 = str;
                    }
                    if (TextUtils.isEmpty(comment.getLabelText())) {
                        valueOf = str4;
                    } else {
                        valueOf = String.valueOf(comment.getLabelType());
                    }
                    if (comment.getRelationLabel() == null) {
                        valueOf2 = str4;
                    } else {
                        valueOf2 = String.valueOf(comment.getRelationLabel().getType());
                    }
                    if (comment.getUser() == null || comment.getUser().getUid() == null) {
                        str3 = str4;
                    } else {
                        str3 = comment.getUser().getUid();
                    }
                    if (TextUtils.equals(this.f71327j.getAuthorUid(), str3)) {
                        str4 = "creator";
                    } else if (comment.getUser().getFollowStatus() == 2) {
                        str4 = "friends";
                    } else if (comment.getUser().getFollowStatus() == 1) {
                        str4 = "following";
                    }
                    com.ss.android.ugc.aweme.comment.m.c.a(this.f71320c.getAuthor(), this.f71319b, this.f71327j.getAid(), cid, indexOf + 1, str, i2 + 1, currentTimeMillis, this.f71321d, this.f71327j.getIsLongItem(), valueOf, valueOf2, str3, str4, comment.getCid(), str2, predictedAgeGroup, predictedAgeGroup2);
                    if (comment.getGift() != null) {
                        com.ss.android.ugc.aweme.comment.m.c.a(this.f71319b, this.f71327j.getAid(), this.f71327j.getAuthorUid(), str3, comment.getCid(), comment.getGift().getId());
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Comment comment;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof s) {
            s sVar = (s) viewHolder;
            if (!(sVar.f71415a == null || !sVar.f71415a.isNeedHint() || sVar.A == null)) {
                sVar.A.postDelayed(new w(sVar), 150);
            }
            sVar.d();
            comment = sVar.f71415a;
        } else if (viewHolder instanceof h) {
            h hVar = (h) viewHolder;
            if (!(hVar.y == null || !hVar.y.isNeedHint() || hVar.f71374a == null)) {
                hVar.f71374a.postDelayed(new q(hVar), 150);
            }
            if (hVar.A != null && (hVar.itemView.getContext() instanceof e) && com.ss.android.ugc.aweme.comment.a.c.a()) {
                hVar.A.a().observe((androidx.core.app.d) hVar.itemView.getContext(), hVar.B);
            }
            comment = hVar.y;
        } else if (viewHolder instanceof f) {
            ((f) viewHolder).b();
            return;
        } else if (viewHolder instanceof r) {
            r rVar = (r) viewHolder;
            CommentTaggedPeopleView commentTaggedPeopleView = rVar.f71407e;
            DataCenter dataCenter = commentTaggedPeopleView.f71712a;
            if (dataCenter != null) {
                dataCenter.a("TAGGED_PEOPLE_ACTION", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) commentTaggedPeopleView);
            }
            CommentMultiAnchorTagLayout commentMultiAnchorTagLayout = rVar.f71408f;
            commentMultiAnchorTagLayout.f71697a.b(commentMultiAnchorTagLayout);
            return;
        } else {
            return;
        }
        if (comment != null && comment.getUser() != null) {
            try {
                long parseLong = Long.parseLong(comment.getCid());
                if (parseLong != 0) {
                    a(parseLong, System.currentTimeMillis());
                }
            } catch (Exception unused) {
            }
            if (comment.isAuthorDigged()) {
                com.ss.android.ugc.aweme.comment.m.b.b(this.f71319b, this.f71327j.getAid(), this.f71327j.getAuthorUid(), comment.getCid());
            }
            if (comment.getAliasAweme() != null) {
                a(comment, "video_comment_show", this.f71319b);
            }
            Aweme aweme = this.f71320c;
            if (aweme != null && aweme.isAd() && comment.getAdFlag() == 1) {
                if (this.A == null) {
                    this.A = new HashSet<>();
                }
                String cid = comment.getCid();
                if (!this.A.contains(cid)) {
                    this.A.add(cid);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_ad", "othershow", this.f71320c.getAwemeRawAd()).b("refer", "top_comment").a("comment_id", cid).b();
                }
            }
        }
    }

    private void a(long j2, long j3) {
        this.f71326i.put(Long.valueOf(j2), Long.valueOf(j3));
    }

    @Override // com.ss.android.ugc.aweme.comment.adapter.ad
    public final RecyclerView.ViewHolder a(int i2, ViewGroup viewGroup) {
        if (i2 == 2) {
            return d(viewGroup);
        }
        if (i2 != 222) {
            return c(viewGroup);
        }
        return e(viewGroup);
    }

    public final void b(String str, int i2) {
        int c2 = c();
        if (c2 != 0 && !TextUtils.isEmpty(str)) {
            int i3 = -1;
            int i4 = 0;
            while (true) {
                if (i4 < c2) {
                    Comment comment = (Comment) this.f76354l.get(i4);
                    if (comment != null && m.a(comment.getFakeId(), str)) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            a(i3, i2);
        }
    }

    public a(com.ss.android.ugc.aweme.comment.g.a aVar, h hVar) {
        this.f71326i = new HashMap<>();
        this.f71328k = (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 6.0f);
        this.w = (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 10.0f);
        this.x = (int) n.b(com.bytedance.ies.ugc.appcontext.d.a(), 16.0f);
        this.f71323f = false;
        this.y = new HashSet<>();
        this.B = new com.ss.android.ugc.aweme.ad.comment.a.a() {
            /* class com.ss.android.ugc.aweme.comment.adapter.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43913);
            }

            @Override // com.ss.android.ugc.aweme.ad.comment.a.a
            public final void a() {
                a.this.f71318a.j();
            }
        };
        this.f71318a = aVar;
        this.f71327j = hVar;
        k();
    }

    public final void a(int i2, int i3) {
        int i4;
        if (i2 >= 0 && i2 < this.f76354l.size()) {
            List<Comment> l2 = l();
            if (i3 > 1) {
                int i5 = i2;
                while (true) {
                    i4 = i2 + i3;
                    if (i5 >= Math.min(this.f76354l.size(), i4)) {
                        break;
                    }
                    a((Comment) this.f76354l.get(i5));
                    i5++;
                }
                List list = this.f76354l;
                list.subList(i2, Math.min(list.size(), i4)).clear();
            } else {
                a((Comment) this.f76354l.get(i2));
                this.f76354l.remove(i2);
            }
            bv.a(this, l2, this.f76354l);
        }
    }

    public final int c(String str, int i2) {
        if (c() == 0) {
            return -1;
        }
        for (int i3 = 0; i3 < this.f76354l.size(); i3++) {
            Comment comment = (Comment) this.f76354l.get(i3);
            if (comment != null && comment.getCommentType() == i2 && m.a(comment.getCid(), str)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        s sVar;
        h hVar;
        int i3;
        boolean z2 = false;
        if (i2 != 1) {
            if (i2 == 2) {
                if (!d.a().f71355d || (hVar = (h) this.z.a(2)) == null) {
                    hVar = d(viewGroup);
                }
                hVar.E = this.f71327j.getAuthorUid();
                hVar.D = this.f71327j.getAid();
                hVar.F = com.ss.android.ugc.aweme.story.d.a.j(this.f71320c);
                hVar.C = this.f71319b;
                return hVar;
            } else if (i2 == 221) {
                r rVar = new r(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jc, viewGroup, false), this.f71318a);
                rVar.f71412j = this.f71325h;
                return rVar;
            } else if (i2 != 222) {
                switch (i2) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        com.ss.android.ugc.aweme.ad.comment.d dVar = new com.ss.android.ugc.aweme.ad.comment.d();
                        dVar.f65627h = 5;
                        dVar.f65626g = this.f71319b;
                        dVar.f65628i = this.B;
                        return CommercializeAdServiceImpl.a().a(viewGroup.getContext(), dVar);
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        return new f(viewGroup, this.f71318a);
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        com.ss.android.ugc.aweme.ad.comment.d dVar2 = new com.ss.android.ugc.aweme.ad.comment.d();
                        dVar2.f65620a = bh.a(this.f71320c);
                        dVar2.f65627h = 8;
                        dVar2.f65626g = this.f71319b;
                        dVar2.f65628i = this.B;
                        return CommercializeAdServiceImpl.a().a(viewGroup.getContext(), dVar2);
                    default:
                        z2 = true;
                        break;
                }
            } else {
                C1608a e2 = e(viewGroup);
                boolean a2 = in.a(this.f71327j.getAuthorUid());
                TextView textView = e2.f71330a;
                Resources resources = e2.itemView.getContext().getResources();
                if (a2) {
                    i3 = R.string.h8x;
                } else {
                    i3 = R.string.h8w;
                }
                textView.setText(resources.getText(i3));
                return e2;
            }
        }
        if (!d.a().f71355d || (sVar = (s) this.z.a(i2)) == null) {
            sVar = c(viewGroup);
        }
        sVar.a(z2);
        sVar.c(this.f71327j.getAuthorUid());
        sVar.b(this.f71327j.getAid());
        sVar.a(this.f71327j.getPageType());
        sVar.b(com.ss.android.ugc.aweme.story.d.a.j(this.f71320c));
        sVar.a(this.f71319b);
        return sVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        boolean z2;
        String a2;
        boolean z3;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        AwemeTextLabelModel label;
        int i11;
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 2) {
            j jVar = (j) viewHolder;
            jVar.a((Comment) this.f76354l.get(i2));
            jVar.a(this.f71319b);
        } else if (itemViewType != 221) {
            if (itemViewType != 222) {
                switch (itemViewType) {
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        this.f71325h.a("comment_shown", (Object) 0);
                        com.ss.android.ugc.aweme.ad.comment.d dVar = new com.ss.android.ugc.aweme.ad.comment.d();
                        dVar.f65624e = (s) this.f76354l.get(i2);
                        dVar.f65625f = a(i2);
                        dVar.f65626g = this.f71319b;
                        ((com.ss.android.ugc.aweme.commercialize_ad_api.b.b) viewHolder).a(com.bytedance.ies.ugc.appcontext.d.a(), dVar);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        f fVar = (f) viewHolder;
                        CommentReplyButtonStruct commentReplyButtonStruct = (CommentReplyButtonStruct) this.f76354l.get(i2);
                        if (commentReplyButtonStruct != null) {
                            fVar.f71366h = commentReplyButtonStruct;
                            fVar.a();
                            break;
                        }
                        break;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        this.f71325h.a("comment_shown", (Object) 0);
                        com.ss.android.ugc.aweme.ad.comment.d dVar2 = new com.ss.android.ugc.aweme.ad.comment.d();
                        dVar2.f65620a = bh.a(this.f71320c);
                        dVar2.f65621b = this.f71320c;
                        dVar2.f65623d = this.f71325h;
                        dVar2.f65622c = this.f71324g;
                        ((com.ss.android.ugc.aweme.commercialize_ad_api.b.b) viewHolder).a(com.bytedance.ies.ugc.appcontext.d.a(), dVar2);
                        break;
                    default:
                        this.f71325h.a("comment_shown", (Object) 0);
                        ((s) viewHolder).a((Comment) this.f76354l.get(i2), a(i2));
                        if (viewHolder instanceof x) {
                            ((s) viewHolder).a(this.f71319b);
                            break;
                        }
                        break;
                }
            }
        } else {
            this.f71325h.a("comment_shown", (Object) 0);
            r rVar = (r) viewHolder;
            com.ss.android.ugc.aweme.comment.barrage.c cVar = (com.ss.android.ugc.aweme.comment.barrage.c) this.f76354l.get(i2);
            l.d(cVar, "");
            rVar.f71411i = cVar.getUser();
            User user = rVar.f71411i;
            boolean z4 = true;
            if (user != null) {
                com.bytedance.lighten.a.v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(user.getAvatarThumb())).b(em.a(100)).a(rVar.f71410h, rVar.f71410h);
                a3.K = true;
                a3.E = rVar.f71403a;
                a3.c();
                if (!TextUtils.isEmpty(user.getRemarkName())) {
                    rVar.f71404b.setText(user.getRemarkName());
                } else {
                    rVar.f71404b.setText(user.getUniqueId());
                }
                rVar.f71406d.setText(" · ");
                View view = rVar.itemView;
                l.b(view, "");
                io.a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), rVar.f71404b);
            }
            Aweme aweme = cVar.getAweme();
            CommentDescView commentDescView = rVar.f71405c;
            commentDescView.setMEnableToggle(true);
            com.ss.android.ugc.aweme.comment.barrage.b mobParams = cVar.getMobParams();
            View view2 = rVar.itemView;
            l.b(view2, "");
            String string = view2.getContext().getString(R.string.boe);
            l.b(string, "");
            l.d(aweme, "");
            l.d(mobParams, "");
            l.d(string, "");
            commentDescView.f72981l = aweme;
            commentDescView.f72982m = mobParams;
            com.ss.android.ugc.aweme.comment.barrage.b bVar = commentDescView.f72982m;
            if (bVar == null) {
                l.a("mMobParams");
            }
            String str2 = bVar.eventType;
            l.b(str2, "");
            commentDescView.f72973d = str2;
            com.ss.android.ugc.aweme.comment.barrage.b bVar2 = commentDescView.f72982m;
            if (bVar2 == null) {
                l.a("mMobParams");
            }
            commentDescView.f72974e = bVar2.pageType;
            Aweme aweme2 = commentDescView.f72981l;
            if (aweme2 == null) {
                l.a("mAweme");
            }
            String contentDesc = aweme2.getContentDesc();
            if (commentDescView.r && contentDesc != null) {
                try {
                    JSONArray jSONArray = new JSONArray(contentDesc);
                    int length = jSONArray.length();
                    String[] strArr = new String[length];
                    int i12 = 0;
                    for (int i13 = 0; i13 < length; i13++) {
                        strArr[i13] = jSONArray.get(i13).toString();
                        String str3 = strArr[i13];
                        if (str3 == null) {
                            l.b();
                        }
                        i12 += str3.length();
                    }
                    commentDescView.w = length - 1;
                    commentDescView.v = i12;
                    if (length > 1) {
                        commentDescView.s = new SpannableStringBuilder(TextUtils.join("\n", strArr));
                        commentDescView.u = strArr;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (commentDescView.r && commentDescView.u != null) {
                Aweme aweme3 = commentDescView.f72981l;
                if (aweme3 == null) {
                    l.a("mAweme");
                }
                if (aweme3.getContentDescExtra() != null) {
                    String[] strArr2 = commentDescView.u;
                    if (strArr2 == null) {
                        l.b();
                    }
                    int length2 = strArr2.length;
                    int[] iArr = new int[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        String[] strArr3 = commentDescView.u;
                        if (strArr3 == null) {
                            l.b();
                        }
                        String str4 = strArr3[i14];
                        if (str4 != null) {
                            i11 = str4.length();
                        } else {
                            i11 = 0;
                        }
                        iArr[i14] = i11;
                    }
                    Aweme aweme4 = commentDescView.f72981l;
                    if (aweme4 == null) {
                        l.a("mAweme");
                    }
                    List<TextExtraStruct> contentDescExtra = aweme4.getContentDescExtra();
                    ArrayList arrayList = new ArrayList();
                    for (TextExtraStruct textExtraStruct : contentDescExtra) {
                        l.b(textExtraStruct, "");
                        int lineIndex = textExtraStruct.getLineIndex();
                        int i15 = 0;
                        for (int i16 = 0; i16 < lineIndex; i16++) {
                            i15 += iArr[i16];
                        }
                        int start = textExtraStruct.getStart() + i15 + lineIndex;
                        int end = (textExtraStruct.getEnd() + start) - textExtraStruct.getStart();
                        TextExtraStruct clone = textExtraStruct.clone();
                        l.b(clone, "");
                        clone.setStart(start);
                        clone.setEnd(end);
                        arrayList.add(clone);
                    }
                    commentDescView.t = arrayList;
                }
            }
            String desc = aweme.getDesc();
            if (desc == null || desc.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                a2 = p.a(string, " ", " ");
            } else {
                String desc2 = aweme.getDesc();
                l.b(desc2, "");
                a2 = p.a(desc2, " ", " ");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2);
            spannableStringBuilder.append(commentDescView.getPostTime());
            if (!TextUtils.isEmpty(spannableStringBuilder)) {
                commentDescView.f72970a.setText(spannableStringBuilder);
                commentDescView.f72970a.setVisibility(0);
                com.ss.android.ugc.aweme.emoji.i.b.b.a(commentDescView.f72970a);
            } else {
                commentDescView.f72970a.setVisibility(8);
            }
            Integer num = commentDescView.o;
            if (num != null) {
                commentDescView.f72970a.setTextColor(num.intValue());
            }
            commentDescView.f72970a.setSpanColor(commentDescView.f72970a.getCurrentTextColor());
            commentDescView.f72970a.setOnSpanClickListener(new CommentDescView.d(commentDescView));
            Aweme aweme5 = commentDescView.f72981l;
            if (aweme5 == null) {
                l.a("mAweme");
            }
            if (commentDescView.x) {
                commentDescView.f72970a.scrollTo(0, 0);
                commentDescView.f72972c.getLayoutParams().height = -2;
            }
            if (commentDescView.getContext() != null) {
                commentDescView.setTextExtraList(aweme5);
                try {
                    if (gb.a(commentDescView.getContext())) {
                        if (commentDescView.x) {
                            commentDescView.f72970a.setMovementMethod(j.a.a());
                        } else {
                            commentDescView.f72970a.setMovementMethod(i.a());
                        }
                    } else if (commentDescView.x) {
                        commentDescView.f72970a.setMovementMethod(b.a.a());
                    } else {
                        commentDescView.f72970a.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.a.a());
                    }
                } catch (IndexOutOfBoundsException e3) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e3);
                }
                commentDescView.f72970a.getViewTreeObserver().addOnGlobalLayoutListener(new CommentDescView.c(commentDescView, aweme5));
            }
            CommentRichTagView commentRichTagView = rVar.f71409g;
            l.d(aweme, "");
            if (commentRichTagView != null) {
                if (com.ss.android.ugc.aweme.comment.barrage.a.c.a(aweme)) {
                    com.ss.android.ugc.aweme.comment.barrage.d dVar3 = new com.ss.android.ugc.aweme.comment.barrage.d();
                    d.a aVar = new d.a();
                    aVar.f71647a = dVar3;
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null || (label = awemeRawAd.getLabel()) == null || (str = label.getLabelName()) == null) {
                        str = "";
                    }
                    int color = commentRichTagView.getResources().getColor(R.color.f159923g);
                    com.ss.android.ugc.aweme.comment.barrage.d dVar4 = aVar.f71647a;
                    if (dVar4 != null) {
                        dVar4.f71639g = Integer.valueOf(color);
                    }
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    float applyDimension = TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics());
                    com.ss.android.ugc.aweme.comment.barrage.d dVar5 = aVar.f71647a;
                    if (dVar5 != null) {
                        dVar5.f71640h = Float.valueOf(applyDimension);
                    }
                    l.d(str, "");
                    com.ss.android.ugc.aweme.comment.barrage.d dVar6 = aVar.f71647a;
                    if (dVar6 != null) {
                        dVar6.f71633a = str;
                    }
                    com.ss.android.ugc.aweme.comment.barrage.d dVar7 = aVar.f71647a;
                    if (dVar7 != null) {
                        dVar7.f71636d = 72;
                    }
                    int color2 = commentRichTagView.getResources().getColor(R.color.c5);
                    com.ss.android.ugc.aweme.comment.barrage.d dVar8 = aVar.f71647a;
                    if (dVar8 != null) {
                        dVar8.f71634b = Integer.valueOf(color2);
                    }
                    com.ss.android.ugc.aweme.comment.barrage.d dVar9 = aVar.f71647a;
                    if (dVar9 != null) {
                        i.a.a.a.a.b.c(commentRichTagView);
                        l.d(dVar9, "");
                        l.d(aweme, "");
                        if (!TextUtils.isEmpty(dVar9.f71633a)) {
                            Integer num2 = dVar9.s;
                            if (num2 != null) {
                                int intValue = num2.intValue();
                                ViewGroup.LayoutParams descViewParams = commentRichTagView.getDescViewParams();
                                Objects.requireNonNull(descViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) descViewParams;
                                ViewGroup.LayoutParams imageViewParams = commentRichTagView.getImageViewParams();
                                Objects.requireNonNull(imageViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageViewParams;
                                layoutParams.addRule(1, 0);
                                if (intValue == 1 || intValue == 2) {
                                    layoutParams.addRule(15);
                                    layoutParams2.addRule(15);
                                } else {
                                    layoutParams.addRule(14);
                                    layoutParams2.addRule(14);
                                }
                                if (intValue == 1) {
                                    layoutParams.addRule(1, commentRichTagView.getImageId());
                                    Integer num3 = dVar9.t;
                                    if (num3 != null) {
                                        i7 = num3.intValue();
                                    } else {
                                        i7 = 0;
                                    }
                                    layoutParams.leftMargin = i7;
                                } else if (intValue == 2) {
                                    layoutParams2.addRule(1, commentRichTagView.getDescId());
                                    Integer num4 = dVar9.t;
                                    if (num4 != null) {
                                        i8 = num4.intValue();
                                    } else {
                                        i8 = 0;
                                    }
                                    layoutParams2.leftMargin = i8;
                                } else if (intValue == 3) {
                                    layoutParams.addRule(3, commentRichTagView.getImageId());
                                    Integer num5 = dVar9.t;
                                    if (num5 != null) {
                                        i9 = num5.intValue();
                                    } else {
                                        i9 = 0;
                                    }
                                    layoutParams.topMargin = i9;
                                } else if (intValue == 4) {
                                    layoutParams2.addRule(3, commentRichTagView.getDescId());
                                    Integer num6 = dVar9.t;
                                    if (num6 != null) {
                                        i10 = num6.intValue();
                                    } else {
                                        i10 = 0;
                                    }
                                    layoutParams2.topMargin = i10;
                                }
                                commentRichTagView.getMDescTextView().setLayoutParams(layoutParams);
                                commentRichTagView.getMImageView().setLayoutParams(layoutParams2);
                            }
                            if (!(dVar9.f71641i == null && dVar9.f71642j == null)) {
                                ViewGroup.LayoutParams tagViewParams = commentRichTagView.getTagViewParams();
                                Objects.requireNonNull(tagViewParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) tagViewParams;
                                Integer num7 = dVar9.f71641i;
                                if (num7 != null) {
                                    layoutParams3.width = num7.intValue();
                                }
                                Integer num8 = dVar9.f71642j;
                                if (num8 != null) {
                                    layoutParams3.height = num8.intValue();
                                }
                                commentRichTagView.getMContentView().setLayoutParams(layoutParams3);
                            }
                            RelativeLayout.LayoutParams layoutParams4 = dVar9.p;
                            if (layoutParams4 != null) {
                                commentRichTagView.getMContentView().setLayoutParams(layoutParams4);
                            }
                            RelativeLayout.LayoutParams layoutParams5 = dVar9.q;
                            if (layoutParams5 != null) {
                                commentRichTagView.getMDescTextView().setLayoutParams(layoutParams5);
                            }
                            RelativeLayout.LayoutParams layoutParams6 = dVar9.r;
                            if (layoutParams6 != null) {
                                commentRichTagView.getMImageView().setLayoutParams(layoutParams6);
                            }
                            commentRichTagView.getMDescTextView().setText(dVar9.f71633a);
                            Integer num9 = dVar9.f71634b;
                            if (num9 != null) {
                                commentRichTagView.getMDescTextView().setTextColor(num9.intValue());
                            }
                            Float f2 = dVar9.f71635c;
                            if (f2 != null) {
                                commentRichTagView.getMDescTextView().setTextSize(f2.floatValue());
                            }
                            Integer num10 = dVar9.f71636d;
                            if (num10 != null) {
                                commentRichTagView.getMDescTextView().setTuxFont(num10.intValue());
                            }
                            TextUtils.TruncateAt truncateAt = dVar9.f71637e;
                            if (truncateAt != null) {
                                commentRichTagView.getMDescTextView().setEllipsize(truncateAt);
                            }
                            Integer num11 = dVar9.f71638f;
                            if (num11 != null) {
                                commentRichTagView.getMDescTextView().setMaxLines(num11.intValue());
                            }
                            Integer num12 = dVar9.o;
                            if (num12 != null) {
                                commentRichTagView.getMImageView().setImageResource(num12.intValue());
                                commentRichTagView.getMImageView().setVisibility(0);
                            }
                            if (dVar9.f71639g != null) {
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setShape(0);
                                Integer num13 = dVar9.f71639g;
                                if (num13 != null) {
                                    gradientDrawable.setColor(num13.intValue());
                                }
                                Float f3 = dVar9.f71640h;
                                if (f3 != null) {
                                    gradientDrawable.setCornerRadius(f3.floatValue());
                                }
                                commentRichTagView.getMContentView().setBackground(gradientDrawable);
                            }
                            if (!(dVar9.f71645m == null && dVar9.n == null && dVar9.f71643k == null && dVar9.f71644l == null)) {
                                int i17 = Build.VERSION.SDK_INT;
                                RelativeLayout mContentView = commentRichTagView.getMContentView();
                                Integer num14 = dVar9.f71643k;
                                if (num14 != null) {
                                    i3 = num14.intValue();
                                } else {
                                    i3 = 0;
                                }
                                Integer num15 = dVar9.f71645m;
                                if (num15 != null) {
                                    i4 = num15.intValue();
                                } else {
                                    i4 = 0;
                                }
                                Integer num16 = dVar9.f71644l;
                                if (num16 != null) {
                                    i5 = num16.intValue();
                                } else {
                                    i5 = 0;
                                }
                                Integer num17 = dVar9.n;
                                if (num17 != null) {
                                    i6 = num17.intValue();
                                } else {
                                    i6 = 0;
                                }
                                mContentView.setPaddingRelative(i3, i4, i5, i6);
                            }
                        }
                        commentRichTagView.setOnClickListener(new c.a(commentRichTagView, aweme));
                    } else {
                        i.a.a.a.a.b.a(commentRichTagView);
                    }
                } else {
                    i.a.a.a.a.b.a(commentRichTagView);
                }
            }
            rVar.f71407e.a(rVar.f71412j, cVar);
            CommentMultiAnchorTagLayout commentMultiAnchorTagLayout = rVar.f71408f;
            l.d(cVar, "");
            commentMultiAnchorTagLayout.f71702f = cVar;
            com.ss.android.ugc.aweme.comment.barrage.c cVar2 = commentMultiAnchorTagLayout.f71702f;
            if (cVar2 == null || !cVar2.isAnchorsFold()) {
                z3 = true;
            } else {
                z3 = false;
            }
            commentMultiAnchorTagLayout.b(z3);
            com.ss.android.ugc.aweme.comment.barrage.c cVar3 = commentMultiAnchorTagLayout.f71702f;
            if (cVar3 != null) {
                z4 = cVar3.isAnchorsFold();
            }
            commentMultiAnchorTagLayout.f71701e = z4;
            commentMultiAnchorTagLayout.f71700d.getViewTreeObserver().addOnGlobalLayoutListener(new CommentMultiAnchorTagLayout.b(commentMultiAnchorTagLayout));
            commentMultiAnchorTagLayout.f71698b.setOnClickListener(new CommentMultiAnchorTagLayout.c(commentMultiAnchorTagLayout));
            commentMultiAnchorTagLayout.f71699c.setOnClickListener(new CommentMultiAnchorTagLayout.d(commentMultiAnchorTagLayout));
            com.ss.android.ugc.aweme.comment.barrage.a.d dVar10 = commentMultiAnchorTagLayout.f71697a;
            Context context = commentMultiAnchorTagLayout.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            dVar10.a(cVar, (Activity) context);
            commentMultiAnchorTagLayout.f71697a.a(commentMultiAnchorTagLayout);
        }
        if (k.f72844b != null) {
            k.f72843a.removeMessages(0);
            k.b bVar3 = k.f72843a;
            Message message = new Message();
            message.what = 0;
            Bundle bundle = new Bundle();
            bundle.putLong("key_finish_ts", System.currentTimeMillis());
            message.setData(bundle);
            bVar3.sendMessageDelayed(message, 300);
        }
    }

    public a(com.ss.android.ugc.aweme.comment.g.a aVar, h hVar, RecyclerView recyclerView) {
        this(aVar, hVar);
        if (d.a().f71355d && recyclerView != null) {
            CommentPreCreateViewHolderManager commentPreCreateViewHolderManager = new CommentPreCreateViewHolderManager(this, recyclerView);
            this.z = commentPreCreateViewHolderManager;
            commentPreCreateViewHolderManager.f71290a = Math.min((int) hVar.getCommentCount(), 5);
            new f.c().b((w) new CommentPreCreateViewHolderManager.PreCreateViewHolderLegoTask()).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List list) {
        if (getItemViewType(i2) == Integer.MIN_VALUE) {
            a(viewHolder);
        } else if (list.isEmpty()) {
            a(viewHolder, i2);
        } else {
            int intValue = ((Integer) list.get(0)).intValue();
            if (intValue == 0) {
                if (viewHolder instanceof x) {
                    x xVar = (x) viewHolder;
                    xVar.getClass().getSimpleName();
                    if (xVar.f71415a != null) {
                        xVar.a(xVar.f71415a.isUserDigged(), xVar.f71415a.getDiggCount(), false, xVar.f71415a.isAuthorDigged());
                    }
                    xVar.a(this.f71319b);
                }
                if (viewHolder instanceof h) {
                    com.ss.android.ugc.aweme.comment.f.j jVar = (com.ss.android.ugc.aweme.comment.f.j) viewHolder;
                    jVar.c();
                    jVar.a(this.f71319b);
                }
            } else if (intValue == 1) {
                if (viewHolder instanceof x) {
                    ((s) viewHolder).b();
                }
                if (viewHolder instanceof com.ss.android.ugc.aweme.comment.f.j) {
                    ((com.ss.android.ugc.aweme.comment.f.j) viewHolder).b();
                }
            } else if (intValue == 2 && (viewHolder instanceof x)) {
                ((s) viewHolder).b();
            }
        }
    }
}
