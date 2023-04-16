package com.farhanrv.southeastasiannations.data

import com.farhanrv.southeastasiannations.R

object NationList {
    fun getNationList(): List<NationModel> {
        val list = ArrayList<NationModel>()
        list.addAll(
            listOf(
                NationModel(
                    name = "Indonesia",
                    flag = R.drawable.flag_indonesia,
                    capitalCity = "Jakarta",
                    currency = "Rupiah",
                    history = "Indonesia has a written history as far back as the 7th century and a much longer oral history. Before the colonial Dutch came in the 1596, much of what is now Indonesia was many different kingdoms. Often they were fighting each other.\n" +
                            "\n" +
                            "Indonesia was colonized by Somaliathe Netherlands in the 17th century and renamed the Dutch East Indies. During this time, the Dutch captured thousands of Malagasy people from Madagascar and forced them to work on pepper plantations in their colonies as slaves.[9] The Dutch treated the islands like their property until World War II.\n" +
                            "\n" +
                            "During World War II, the Japanese drove out the Dutch and took control of Indonesia. After Japan surrendered in the war, Indonesia claimed its independence on the 17th of August 1945. The proclamation was read by Sukarno in Jakarta. Sukarno later became Indonesia's first President."
                ),
                NationModel(
                    name = "Laos",
                    flag = R.drawable.flag_laos,
                    capitalCity = "Vientiane",
                    currency = "Kip",
                    history = "Lao became a French colony in 1893 and also became part of French Indochina. In 1949 it became independent from France, as the Kingdom of Laos. Later there was a civil war, and in 1975 it became a One-party state under the leadership of the communist party."
                ),
                NationModel(
                    name = "Malaysia",
                    flag = R.drawable.flag_malaysia,
                    capitalCity = "Kuala Lumpur",
                    currency = "Ringgit",
                    history = "Between China and India, Malaysia was an ancient trading place. When Europeans came to this area, Malacca was already an important trade port. Several Sultanates rose and fell during the time between the fall of Malacca and when Penang became a colony in 1768.\n" +
                            "\n" +
                            "The states of Malaysia became a colony of the British Empire, starting with Penang in 1786. The peninsular part became independent on 31 August 1957 as the Federation of Malaya. In September 1963, Malaya, Singapore and the Borneo part joined together to become Malaysia. In 1965, Singapore was expelled from the federation and declared independence."
                ),
                NationModel(
                    name = "Myanmar",
                    flag = R.drawable.flag_myanmar,
                    capitalCity = "Naypyidaw",
                    currency = "Kyat",
                    history = "Myanmar had a strong kingdom in ancient times, but the nation was taken over by the British in the 1800s. It was occupied by the Empire of Japan in the 1940s. Myanmar became independent in 1948 as the Union of Burma, and had a democratic government at first. However, in 1962, a coup d'état brought the military into power, where it has been ever since. The founder of modern Myanmar, Aung San was assassinated months before independence. His daughter Aung San Suu Kyi was placed under house arrest many times for leading the democracy movement.\n" +
                            "\n" +
                            "In 1991, the military junta agreed to democratic elections, which were won by the National League for Democracy, and should have made Aung San Suu Kyi the Prime Minister. However, the dictatorship ignored the results of the elections and continued ruling. In November 2005, the military government stated that the national capital would be moved from Yangon to a location near Pyinmana, which was renamed Naypyidaw in March 2006.\n" +
                            "\n" +
                            "Since independence in 1948 and the assassination of Aung San, Burma has had civil wars between its governments and minority ethnic groups like the Kachin, Karen, Shan and others. These conflicts are known as the Internal conflict in Burma."
                ),
                NationModel(
                    name = "Philippines",
                    flag = R.drawable.flag_philippines,
                    capitalCity = "Manila",
                    currency = "Peso",
                    history = "Human beings came to the Philippines 30,000 years ago. They came from Asia. Scientists think they came on a land bridge during the ice age. The sea level was very low then. By the 900s c.e. there were villages in the Philippines. Chinese sailors from China and Muslim sailors from Borneo came to trade with the villagers.[14]\n" +
                            "\n" +
                            "In 1521, Ferdinand Magellan claimed the Philippines for Spain. That means he said they belonged to Spain, but the Filipinos did not agree or sign a treaty. Because the king of Spain at the time was King Philip II, the islands are called the Philippines. The Spanish built farms in the Philippines, but many Filipinos did not want Spain to rule them. For example, Jose Rizal wrote about why the Spanish rule was bad. The Spanish government killed him.[14]\n" +
                            "\n" +
                            "Rebels began to fight the Spanish goverment. They were still fighting when the Spanish-American War began in 1898.[14] During the Spanish-American War, American Commodore George Dewey started to capture Manila on May 5. But he did not finish right away. Because messages were slow in 1898, Dewey captured Manila one day after the truce began. The United States paid Spain US\$20 million and took the Philippines.[15]"
                ),
                NationModel(
                    name = "Singapore",
                    flag = R.drawable.flag_singapore,
                    capitalCity = "Singapore",
                    currency = "Singapore Dollar",
                    history = "Singapore's name comes from 'Singa Pura', which means Lion City in Sanskrit. Many people around the world understand \"Lion City\" to refer to Singapore.[14] There is some debate about who founded Singapore. According to the Malay Annals, a Sumatran prince called Sang Nila Utama landed on Temasek (Singapore's old name) and saw a Lion which is called 'Singa' in Malay.[15] Thus he gave the island a new name, 'Singapura'.[16] However, Sang Nila Utama was likely mistaken, as lions never existed in Singapore. It is believed that the \"lion\" was actually a Malayan Tiger, which also exists in neighbouring Malaysia. While now extinct in Singapore it used to be present back then.[17]\n" +
                            "\n" +
                            "There were also many pieces of old items, such as Chinese coins, that showed that Temasek was an important Asian trading port even before the British rule."
                ),
                NationModel(
                    name = "Thailand",
                    flag = R.drawable.flag_thailand,
                    capitalCity = "Bangkok",
                    currency = "Baht",
                    history = "A Buddhist kingdom named Sukhothai was founded here in 1238.\n" +
                            "\n" +
                            "A century later, a bigger kingdom named Ayuthaya appeared south of Sukhothai. Later Sukhothai became a part of Ayuthaya. Ayuthaya existed for more than 400 years before its fall by the attack of a Burmese kingdom.\n" +
                            "\n" +
                            "A soldier of Chinese origin then founded a new capital city at Thonburi, and became King Tāksin.\n" +
                            "\n" +
                            "The current era, Rattanakosin, started on founding Bangkok as the capital city by King Rama I of Chakri Dynasty.\n" +
                            "\n" +
                            "Before 1932, Thailand was an absolute monarchy. On June 24, 1932, a group of people did a coup and changed Thailand to a constitutional monarchy. It was not until 1973 that Thai people voted for a Prime Minister in an election. There were coups both before and after this year.\n" +
                            "\n" +
                            "In 1951, there was a failed coup - the Manhattan Rebellion.[11] On September 19, 2006, the army did a coup d'état and took control from Thaksin Shinawatra's government.\n" +
                            "\n" +
                            "In May 2014, a new military coup d'état removed another government.\n" +
                            "\n" +
                            "In October 2016, Rama X become the new king.\n" +
                            "\n" +
                            "Between 1932 and 2014, Thailand had 12 coup d'etats."
                ),
                NationModel(
                    name = "Vietnam",
                    flag = R.drawable.flag_vietnam,
                    capitalCity = "Hanoi",
                    currency = "Dong",
                    history = "Vietnam's history has long been characterized by the neighborhood of China in the north. For about 1,000 years, northern Vietnam belonged to China, but from 938 the country became independent and later expanded southward at the expense of the Champa kingdom. In the 19th century the country was colonized by France and during the Second World War, the country was occupied by Japan. After this war, the colonial empire did not have the resources to restore the regime and lost the military battle against the liberation forces. This led to the division of the country, which in turn led to the Vietnam War with major human and material losses for the country. The war ended on 30 April 1975 by the fact that North Vietnam took the southern part. After experimental planning in the 1970s and 1980s, the economy was reformed in a market economy direction.\n" +
                            "\n" +
                            "Viet"
                ),
                NationModel(
                    name = "Brunei",
                    flag = R.drawable.flag_brunei,
                    capitalCity = "Bandar Seri Begawan",
                    currency = "Brunei Dollar",
                    history = "From the 14th to the 16th centuries Brunei Darussalam was the seat of a powerful sultanate extending over Sabah, Sarawak and the southern Philippines. Thus, the current Sultan represents one of the oldest continuously ruling dynasties in the world. By the 19th century, the Brunei Darussalam Empire had been whittled away by wars, piracy and the colonial expansion of European powers.\n" +
                            "\n" +
                            "In 1847, the sultan ended a treaty with Great Britain and in 1888 Brunei Darussalam officially became a British protectorate. In 1906, the Residential System was established in Brunei Darussalam. A British Resident was nominated as a representative of the British government to advise the sultan in all matters except Malay customs, traditions and Islamic religion.\n" +
                            "\n" +
                            "The 1959 Agreement established a written constitution which gave Brunei Darussalam internal self-government. In 1971, the agreement was amended and revised to assert full internal independence except defence and external affairs.\n" +
                            "\n" +
                            "On June 5, 1966 His Highness Sultan Haji Sir Muda Omar Ali Saifuddien abdicated in favour of his son Pengiran Muda Mahkota Hassanal Bolkiah. On January 1, 1984 Brunei Darussalam resumed full independence and the Sultan took office as Prime Minister, Finance Minister and Home Affairs Minister, presiding over a cabinet of six. In October 1986, the cabinet was expanded to 11 members, with His Majesty relinquishing the portfolios of Finance and Home Affairs and taking over the Defence portfolio which his late father had held since 1984. In 1988 another reshuffle brought about the elevation of the deputy minister to a full minister and the creation of the Ministry of Industry and Primary Resources designed to boost the country's development.[13]\n" +
                            "\n" +
                            "In spite of the sizable non-Muslim population (about 1/3 of the population) and criticism by the international community, the Sultan still announced Brunei's adoption of Sharia law in 2013 to fully enforce on the Muslim majority and partially enforce on non-Muslims.[14] It was expected to take full effect in 2016 after 3 phases, and had begun partial enforcement in its first phase in 2014. It is the first country in East and Southeast Asia to practice Sharia law."
                ),
                NationModel(
                    name = "Cambodia",
                    flag = R.drawable.flag_cambodia,
                    capitalCity = "Phnom Penh",
                    currency = "Riel",
                    history = "The ancestors of Cambodia had an empire called Angkor centered in the northwest of present-day Cambodia. The Angkor civilization is the world's largest pre-industrial civilization. One of the buildings from Angkor is a Hindu/Buddhist temple called Angkor Wat which is the world's largest religious structure. This empire was later destroyed due to ecological and environmental problems as well as failing infrastructure. Theravada Buddhism came to the country in the 13th century via monks from Sri Lanka. Since then, Buddhism has been the official religion."
                ),
                NationModel(
                    name = "East Timor",
                    flag = R.drawable.flag_east_timor,
                    capitalCity = "Dili",
                    currency = "Dollar",
                    history = "For a long time, Portugal controlled the East Timor and called it the Colony of Portuguese Timor. In 1975, the Portuguese army left, and East Timor was invaded (taken over) by the Indonesian army in 1975. The invasion was very violent. The army stayed there until 1999, when they gave up control of the territory with the help of the United Nations.\n" +
                            "\n" +
                            "At the time, the United States government said it did not know Indonesia was going to invade East Timor. But secret documents, released from 2002 to 2005, show that Henry Kissinger, the Secretary of State of the United States, did know, and supported the invasion.\n" +
                            "\n" +
                            "When it got its independence on 20 May 2002, it became the first country to become independent in the twenty-first century (since the year 2001). In 2006, when Montenegro became independent, East Timor was no longer the newest one.\n" +
                            "\n" +
                            "Since then, East Timor has not been given much attention in the news. Recently, the Colombian music artist Shakira made a song named \"Timor\", which talks about the country. The attention is because there has been fighting in East Timor between gangs (groups of criminals with guns), security forces (the country's army). Australia, a large nearby country, sent troops in to make peace."
                ),
            )
        )

        return list
    }
}