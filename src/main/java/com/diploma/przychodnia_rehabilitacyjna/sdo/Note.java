package com.diploma.przychodnia_rehabilitacyjna.sdo;

/**
 * Created by sylwia on 24.11.18.
 */
public class Note {
    private Long id;

    private String contentOfNote;

    public Note(Long id, String contentOfNote) {
        this.id = id;
        this.contentOfNote = contentOfNote;
    }

    public Note (com.diploma.przychodnia_rehabilitacyjna.dao.Note note){
        this.id=note.getId();
        this.contentOfNote=note.getContentOfNote();
    }


    public Note() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContentOfNote() {
        return contentOfNote;
    }

    public void setContentOfNote(String contentOfNote) {
        this.contentOfNote = contentOfNote;
    }
}
