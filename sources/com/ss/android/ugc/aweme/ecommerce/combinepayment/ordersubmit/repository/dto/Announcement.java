package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class Announcement {
    @c(a = "announcement_id")
    private final String announcementId;
    @c(a = "background")
    private final Image background;
    @c(a = "icon")
    private final Image icon;
    @c(a = "link")
    private final String link;
    @c(a = "text")
    private final String text;

    static {
        Covode.recordClassIndex(53103);
    }

    public static /* synthetic */ Announcement copy$default(Announcement announcement, String str, String str2, Image image, String str3, Image image2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = announcement.announcementId;
        }
        if ((i2 & 2) != 0) {
            str2 = announcement.text;
        }
        if ((i2 & 4) != 0) {
            image = announcement.icon;
        }
        if ((i2 & 8) != 0) {
            str3 = announcement.link;
        }
        if ((i2 & 16) != 0) {
            image2 = announcement.background;
        }
        return announcement.copy(str, str2, image, str3, image2);
    }

    public final String component1() {
        return this.announcementId;
    }

    public final String component2() {
        return this.text;
    }

    public final Image component3() {
        return this.icon;
    }

    public final String component4() {
        return this.link;
    }

    public final Image component5() {
        return this.background;
    }

    public final Announcement copy(String str, String str2, Image image, String str3, Image image2) {
        return new Announcement(str, str2, image, str3, image2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Announcement)) {
            return false;
        }
        Announcement announcement = (Announcement) obj;
        return l.a(this.announcementId, announcement.announcementId) && l.a(this.text, announcement.text) && l.a(this.icon, announcement.icon) && l.a(this.link, announcement.link) && l.a(this.background, announcement.background);
    }

    public final int hashCode() {
        String str = this.announcementId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Image image2 = this.background;
        if (image2 != null) {
            i2 = image2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "Announcement(announcementId=" + this.announcementId + ", text=" + this.text + ", icon=" + this.icon + ", link=" + this.link + ", background=" + this.background + ")";
    }

    public final String getAnnouncementId() {
        return this.announcementId;
    }

    public final Image getBackground() {
        return this.background;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getText() {
        return this.text;
    }

    public final Announcement merge(Announcement announcement) {
        if (announcement == null) {
            return this;
        }
        String str = announcement.announcementId;
        if (str == null) {
            str = this.announcementId;
        }
        String str2 = announcement.text;
        if (str2 == null) {
            str2 = this.text;
        }
        Image image = announcement.icon;
        if (image == null) {
            image = this.icon;
        }
        String str3 = announcement.link;
        if (str3 == null) {
            str3 = this.link;
        }
        Image image2 = announcement.background;
        if (image2 == null) {
            image2 = this.background;
        }
        return new Announcement(str, str2, image, str3, image2);
    }

    public Announcement(String str, String str2, Image image, String str3, Image image2) {
        this.announcementId = str;
        this.text = str2;
        this.icon = image;
        this.link = str3;
        this.background = image2;
    }
}
