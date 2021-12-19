package com.bytedance.ies.xbridge.model.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.params.a;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public final class XSetCalendarEventMethodParamModel extends a {
    public static final a Companion = new a((byte) 0);
    private final String action;
    private Long alarmOffsets;
    private Boolean allDay;
    private Long endDate = 0L;
    private String eventID;
    private String location;
    private String notes;
    private Long startDate = 0L;
    private String title;
    private String url;

    static {
        Covode.recordClassIndex(21723);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21724);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getAction() {
        return this.action;
    }

    public final Long getAlarmOffsets() {
        return this.alarmOffsets;
    }

    public final Boolean getAllDay() {
        return this.allDay;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String toString() {
        String canonicalName = getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "XCalendarMethodParamModel";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName + '(');
        sb.append("action = " + this.action + " ,");
        sb.append("eventID = " + this.eventID + " , ");
        sb.append("startDate = " + this.startDate + " , ");
        sb.append("endDate = " + this.endDate + " , ");
        sb.append("alarmOffsets = [ " + this.alarmOffsets + ' ');
        sb.append("], ");
        sb.append("allDay = " + this.allDay + " , ");
        sb.append("title = " + this.title + " , ");
        sb.append("notes = " + this.notes + " , ");
        sb.append("location = " + this.location + " , ");
        sb.append("url = " + this.url + ')');
        String sb2 = sb.toString();
        l.a((Object) sb2, "");
        return sb2;
    }

    public final void setAlarmOffsets(Long l2) {
        this.alarmOffsets = l2;
    }

    public final void setAllDay(Boolean bool) {
        this.allDay = bool;
    }

    public final void setEndDate(Long l2) {
        this.endDate = l2;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setNotes(String str) {
        this.notes = str;
    }

    public final void setStartDate(Long l2) {
        this.startDate = l2;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public XSetCalendarEventMethodParamModel(String str) {
        l.c(str, "");
        this.action = str;
    }

    public static final XSetCalendarEventMethodParamModel convert(n nVar) {
        String str;
        l.c(nVar, "");
        String str2 = i.a(nVar, "eventID", "");
        if (l.a((Object) str2, (Object) "")) {
            str = "create";
        } else {
            str = "update";
        }
        Long a2 = a.C0864a.a(nVar, "startDate");
        Long a3 = a.C0864a.a(nVar, "endDate");
        String str3 = i.a(nVar, "location", "");
        String str4 = i.a(nVar, "url", "");
        String str5 = i.a(nVar, "title", "");
        String str6 = i.a(nVar, "notes", "");
        boolean a4 = i.a(nVar, "allDay", false);
        Long valueOf = Long.valueOf((long) a.C0864a.a(nVar, "alarmOffset", 0));
        XSetCalendarEventMethodParamModel xSetCalendarEventMethodParamModel = new XSetCalendarEventMethodParamModel(str);
        xSetCalendarEventMethodParamModel.setStartDate(a2);
        xSetCalendarEventMethodParamModel.setEndDate(a3);
        xSetCalendarEventMethodParamModel.setTitle(str5);
        xSetCalendarEventMethodParamModel.setEventID(str2);
        xSetCalendarEventMethodParamModel.setNotes(str6);
        xSetCalendarEventMethodParamModel.setAlarmOffsets(valueOf);
        xSetCalendarEventMethodParamModel.setLocation(str3);
        xSetCalendarEventMethodParamModel.setUrl(str4);
        xSetCalendarEventMethodParamModel.setAllDay(Boolean.valueOf(a4));
        String action2 = xSetCalendarEventMethodParamModel.getAction();
        if (action2 == null || action2.length() == 0 || !h.a.i.a(new String[]{"create", "delete", "update", "read"}, xSetCalendarEventMethodParamModel.getAction())) {
            return null;
        }
        if (l.a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "create") || l.a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "update")) {
            if ((l.a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "update") && xSetCalendarEventMethodParamModel.getEventID() == null) || xSetCalendarEventMethodParamModel.getStartDate() == null || xSetCalendarEventMethodParamModel.getEndDate() == null) {
                return null;
            }
            Long endDate2 = xSetCalendarEventMethodParamModel.getEndDate();
            if (endDate2 == null) {
                l.a();
            }
            long longValue = endDate2.longValue();
            Long startDate2 = xSetCalendarEventMethodParamModel.getStartDate();
            if (startDate2 == null) {
                l.a();
            }
            if (longValue < startDate2.longValue()) {
                return null;
            }
            Long endDate3 = xSetCalendarEventMethodParamModel.getEndDate();
            if (endDate3 == null) {
                l.a();
            }
            if (endDate3.longValue() < 0) {
                return null;
            }
            Long startDate3 = xSetCalendarEventMethodParamModel.getStartDate();
            if (startDate3 == null) {
                l.a();
            }
            if (startDate3.longValue() < 0 || xSetCalendarEventMethodParamModel.getAlarmOffsets() == null) {
                return null;
            }
            Long alarmOffsets2 = xSetCalendarEventMethodParamModel.getAlarmOffsets();
            if (alarmOffsets2 == null) {
                l.a();
            }
            if (alarmOffsets2.longValue() < 0 || xSetCalendarEventMethodParamModel.getAllDay() == null || xSetCalendarEventMethodParamModel.getTitle() == null || xSetCalendarEventMethodParamModel.getNotes() == null || xSetCalendarEventMethodParamModel.getLocation() == null || xSetCalendarEventMethodParamModel.getAllDay() == null || xSetCalendarEventMethodParamModel.getUrl() == null) {
                return null;
            }
            return xSetCalendarEventMethodParamModel;
        } else if ((l.a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "delete") || l.a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "read")) && xSetCalendarEventMethodParamModel.getEventID() == null) {
            return null;
        }
        return xSetCalendarEventMethodParamModel;
    }
}
