package com.example.actitvity2.data

import com.example.actitvity2.data.entities.Email

object DataProvider {
    val buzon = ArrayList<Email>()

    init {
        inicializateBuzon()
    }

    private fun inicializateBuzon() {
        var email = Email("Sam","Weekend adventure","Let´s go fishing John and other, We will to splain all about this amazing place.",0)
        buzon.add(email)
        email = Email("Facebook","James you have 1 new notifications","A lot has happened on Facebook since people need to tell some about your amazing car, can you see this message?",1)
        buzon.add(email)
        email = Email("Google+","Top suggested Google+ pages for you","Top suggested Google+ pages for you, in this case we need to show all activity own account.",2)
        buzon.add(email)
        email = Email("Twitter","Follow T-Mobile, Samsumg Mobile U","James, some people you may know, and this is one suggestion for you. if you can, should to follow now this account",3)
        buzon.add(email)
        email = Email("Pinterest Weekly","Pins you´ll love!","Here you seen these Pins yet? Pinterest, our suggestion team they want to show all our best pins for you.",4)
        buzon.add(email)
        email = Email("Josh","Going launh","Your Launch is here, are you ready for get to come right now yor the best eat in the world and all is free",5)
        buzon.add(email)
        email = Email("Torre","Alexander Torrenegra publicó un trabajo flexible: Technical UX/UI coach","CEO of Torre, the matching network for work. Founder of Tribe, Bunny Studio, and Voice123. Investor. \uD83E\uDD88.",6)
        buzon.add(email)
        email = Email("Indeed","17 new junior vacancies","Horse Surgeon Pty Ltd is hiring for Junior Full Time Ambulatory Position + 17 new junior jobs",7)
        buzon.add(email)
        email = Email("Torre ","Jhon Anderson Martinez Castro Te ha enviado un nuevo mensaje","Hola mi querido amigo tienes tiempo está semana para tomar la mejor vacante para fullstack nunca antes vista?",8)
        buzon.add(email)
        email = Email("MARiA VICTORIA HERRERA DEDERLE",
            "REDES DE DATOS II. UNIDAD 3",
            "Cordial saludo apreciados estudiantes, Ya se encuentra disponible la unidad 3 para su desarrollo. Los temas de la unidad son: Direccionamiento IP versión 6 (IPv6) Y Soluciones IoT (Internet de las cosas)",9)
        buzon.add(email)
        email = Email("Torre Talent ",
            "J[Acción requerida] ¡Qualita Corp SAS está contratando! Te invitaron al trabajo: 'Desarrollador full-stack'",
            "Hola, Danis Como líder de este proceso de contratación, me pongo en contacto contigo porque tu perfil me pareció interesante y me gustaría invitarte a que consideres esta oportunidad abierta: Desarrollador full-stack en Qualita Corp SAS. Ubicación: Remota. Por favor entra a este enlace para ver más",10)
        buzon.add(email)
    }

}