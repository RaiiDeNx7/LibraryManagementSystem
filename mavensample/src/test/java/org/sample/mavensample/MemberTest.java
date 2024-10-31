package org.sample.mavensample;

import junit.framework.TestCase;

public class MemberTest extends TestCase {
    private Member member;

    protected void setUp() throws Exception {
        member = new Member("Bob", "M001");
    }

    public void testMemberConstructor() {
        assertEquals("Name should be 'Bob'", "Bob", member.name);
        assertEquals("ID should be 'M001'", "M001", member.id);
    }

    public void testDescribe() {
        assertEquals("describe() should return 'Member'", "Member", member.describe());
    }

    protected void tearDown() throws Exception {
        member = null;
    }
}
