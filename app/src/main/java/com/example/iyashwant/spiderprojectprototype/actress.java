package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rajiv on 6/8/17.
 */

public class actress extends Actoractresscommon {


    String hip_size;
    String desc_tags[];
    boolean isdance;
    boolean isswim;
    boolean issports;
    boolean istravelvisa;
    boolean ispriorexperience;
    String sing_style;

    public String getPrior_exp_links() {
        return prior_exp_links;
    }

    public void setPrior_exp_links(String prior_exp_links) {
        this.prior_exp_links = prior_exp_links;
    }

    String prior_exp_links;

    public String getSing_style() {
        return sing_style;
    }

    public void setSing_style(String sing_style) {
        this.sing_style = sing_style;
    }

    public String getDance_style() {
        return dance_style;
    }

    public void setDance_style(String dance_style) {
        this.dance_style = dance_style;
    }

    String dance_style;

    public boolean issing() {
        return issing;
    }

    public void setIssing(boolean issing) {
        this.issing = issing;
    }

    boolean issing;
    String sports,priorexperience_desc,pic_links,videolinks;

    public String getHip_size() {
        return hip_size;
    }

    public void setHip_size(String hip_size) {
        this.hip_size = hip_size;
    }

    public String[] getDesc_tags() {
        return desc_tags;
    }

    public void setDesc_tags(String[] desc_tags) {
        this.desc_tags = desc_tags;
    }

    public boolean isdance() {
        return isdance;
    }

    public void setIsdance(boolean isdance) {
        this.isdance = isdance;
    }

    public boolean isswim() {
        return isswim;
    }

    public void setIsswim(boolean isswim) {
        this.isswim = isswim;
    }

    public boolean issports() {
        return issports;
    }

    public void setIssports(boolean issports) {
        this.issports = issports;
    }

    public boolean istravelvisa() {
        return istravelvisa;
    }

    public void setIstravelvisa(boolean istravelvisa) {
        this.istravelvisa = istravelvisa;
    }

    public boolean ispriorexperience() {
        return ispriorexperience;
    }

    public void setIspriorexperience(boolean ispriorexperience) {
        this.ispriorexperience = ispriorexperience;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getPriorexperience_desc() {
        return priorexperience_desc;
    }

    public void setPriorexperience_desc(String priorexperience_desc) {
        this.priorexperience_desc = priorexperience_desc;
    }

    public String getPic_links() {
        return pic_links;
    }

    public void setPic_links(String pic_links) {
        this.pic_links = pic_links;
    }

    public String getVideolinks() {
        return videolinks;
    }

    public void setVideolinks(String videolinks) {
        this.videolinks = videolinks;
    }

    actress()
    {
        hip_size = null;
        desc_tags = null;
        isdance = false;
        ispriorexperience = false;
        issports = false;
        isswim = false;
        istravelvisa = false;
        sports = null;
        priorexperience_desc = null;
        prior_exp_links=null;
        pic_links = null;
        videolinks = null;
        dance_style=null;
        sing_style=null;
    }

}
