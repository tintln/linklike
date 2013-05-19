package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LinkController)
@Mock([Link])
class LinkControllerTests {

    void testCreate(){
    	params.title = "Hotmail"
     	params.url = "www.hotmail.com"
     	controller.create()
     	assert Link.count == 1 
    }

    void testVote(){
    	def link = new Link(title: "GitHub", url: "www.github.com")
        link.save()
        params.id = link.id
     	controller.vote()
     	assertEquals 1, link.votes
    }
}
