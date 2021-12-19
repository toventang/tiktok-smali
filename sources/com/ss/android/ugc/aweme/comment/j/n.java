package com.ss.android.ugc.aweme.comment.j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.c.a.p;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.i.f;
import com.ss.android.ugc.aweme.comment.m;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class n extends c<l, q> {

    /* renamed from: a  reason: collision with root package name */
    public int f72053a;

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f72054b;

    /* renamed from: c  reason: collision with root package name */
    private Comment f72055c;

    static {
        Covode.recordClassIndex(44261);
    }

    public n() {
        a(new l());
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        super.b();
        if (this.f76397i != null) {
            ((q) this.f76397i).b(this.f72055c);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        this.f72054b = null;
        if (this.f76397i == null || this.f76396h == null || this.f76396h.mData == null || this.f76396h.mData.comment == null) {
            Comment comment = this.f72055c;
            if (comment != null && comment.getFakeGiftId() != 0 && this.f76397i != null && this.f76396h != null && this.f76396h.mData != null && this.f76396h.mData.comment == null) {
                ((q) this.f76397i).d(this.f72055c);
                return;
            }
            return;
        }
        Comment comment2 = this.f76396h.mData.comment;
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("mus_af_comment", comment2.getAwemeId());
        if (this.f72053a != 1 || b.a((Collection) comment2.getReplyComments())) {
            if (this.f72053a != 2 || b.a((Collection) comment2.getReplyComments())) {
                comment2.setCommentType(this.f72053a);
                if (comment2.getReplyComments() == null) {
                    comment2.setReplyComments(new ArrayList());
                }
            } else {
                Comment comment3 = comment2.getReplyComments().get(0);
                comment2.setReplyToReplyId(comment3.getCid());
                if (!TextUtils.equals(comment2.getReplyId(), comment2.getReplyToReplyCommentId())) {
                    comment2.setReplyToUserName(in.a(comment3.getUser()));
                } else {
                    comment2.setReplyToReplyId("0");
                }
                comment2.setReplyComments(null);
                comment2.setCommentType(2);
            }
            ((q) this.f76397i).c(comment2);
            return;
        }
        Comment comment4 = comment2.getReplyComments().get(0);
        comment4.setCommentType(1);
        ArrayList arrayList = new ArrayList();
        comment2.setReplyComments(null);
        comment2.setCommentType(2);
        arrayList.add(comment2);
        comment4.setReplyComments(arrayList);
        ((q) this.f76397i).c(comment4);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((q) this.f76397i).a(exc, this.f72055c);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        this.f72054b = new ArrayList();
        for (Object obj : objArr) {
            this.f72054b.add(obj);
        }
        return super.a(objArr);
    }

    public final void b(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        this.f72054b = arrayList;
        arrayList.addAll(Arrays.asList(objArr));
        if (this.f76396h != null && !j()) {
            this.f76396h.sendRequest(objArr);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: com.ss.android.ugc.aweme.comment.model.Comment */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: com.ss.android.ugc.aweme.comment.model.Comment */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: com.ss.android.ugc.aweme.comment.model.Comment */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(f fVar) {
        int i2;
        m.a aVar;
        Comment comment = new Comment();
        this.f72055c = comment;
        comment.setStoryEmojiComment(fVar.q);
        this.f72055c.setAwemeId(fVar.f71954a);
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        Aweme b2 = AwemeService.b().b(fVar.f71954a);
        if (b2 != null && TextUtils.equals(b2.getAuthorUid(), curUser.getUid())) {
            Context j2 = com.bytedance.ies.ugc.appcontext.f.j();
            if (j2 == null) {
                j2 = d.a();
            }
            this.f72055c.setLabelText(j2.getString(R.string.x1));
            this.f72055c.setLabelType(1);
        }
        curUser.setUserDisplayName(in.a(curUser, false));
        this.f72055c.setUser(curUser);
        String sb = new StringBuilder().append(System.currentTimeMillis()).append(UUID.randomUUID()).toString();
        this.f72055c.setFakeId(sb);
        this.f72055c.setText(fVar.f71955b);
        this.f72055c.setCommentType(this.f72053a);
        this.f72055c.setReplyComments(new ArrayList());
        this.f72055c.setShouldDisplayFakeComment(true);
        if (!TextUtils.isEmpty(fVar.f71958e)) {
            this.f72055c.setReplyId(fVar.f71956c);
            this.f72055c.setTextExtra(fVar.f71957d);
            this.f72055c.setReplyToReplyId(fVar.f71958e);
            m.b(this.f72055c, 2);
        } else if (!TextUtils.isEmpty(fVar.f71956c)) {
            this.f72055c.setReplyId(fVar.f71956c);
            this.f72055c.setTextExtra(fVar.f71957d);
            this.f72055c.setReplyToReplyId(fVar.f71956c);
            m.b(this.f72055c, 2);
        } else {
            this.f72055c.setReplyId(fVar.f71956c);
            this.f72055c.setTextExtra(fVar.f71957d);
            this.f72055c.setReplyToReplyId(null);
            if (fVar.f71965l != 0 && !p.a(fVar.f71964k)) {
                this.f72055c.setFakeGiftId(fVar.f71965l);
                this.f72055c.setGiftEffectPath(fVar.f71966m);
                if (p.a(fVar.f71955b)) {
                    this.f72055c.setShouldDisplayFakeComment(false);
                }
            }
            m.b(this.f72055c, 1);
        }
        Comment comment2 = this.f72055c;
        if (fVar.o == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        comment2.setCommentStructType(i2);
        fVar.f71962i = sb;
        m.j(this.f72055c);
        Comment comment3 = this.f72055c;
        l.d(fVar, "");
        if (comment3 != null) {
            Map<String, m.a> map = m.f72082a;
            String fakeId = comment3.getFakeId();
            l.b(fakeId, "");
            m.a aVar2 = m.f72082a.get(comment3.getFakeId());
            if (aVar2 == null || (aVar = m.a.a(aVar2, 0, null, 0, fVar, 0, null, 55)) == null) {
                aVar = new m.a(0, null, 0, fVar, 0, null, 55);
            }
            map.put(fakeId, aVar);
        }
        return super.a(fVar);
    }
}
