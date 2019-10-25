package cn.yanpeng.shijie.pojo;

import java.util.Date;
/**
 * @ClassName Directory
 * @Description TODO
 * @Author YANPENG
 * @Date 2019/10/25 18:00
 * @Version 1.0
 */
public class Directory {
    private Long id;

    private String dirName;

    private Long pid;

    private Date createtime;

    private Date updatetime;

    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName == null ? null : dirName.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}